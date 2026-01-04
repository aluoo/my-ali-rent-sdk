package com.anyi.alipay.rent.spi;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayRequest;
import com.alipay.api.AlipayResponse;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.model.common.BaseResponse;
import com.anyi.alipay.rent.model.common.Result;
import com.anyi.alipay.rent.exception.AlipayRentException;
import cn.hutool.json.JSONUtil;

public abstract class AbstractApiHandler<Req extends BaseRequest, Resp extends BaseResponse>
        implements ApiHandler {

    @Override
    public <T extends BaseResponse> Result<T> execute(AlipayClient client,
                                                      BaseRequest request,
                                                      Class<T> respClazz) {
        try {
            @SuppressWarnings("unchecked")
            Req castReq = (Req) request;
            AlipayRequest<? extends AlipayResponse> alipayRequest = buildRequest(castReq);

            AlipayResponse alipayResponse = client.execute(alipayRequest);

            if (!alipayResponse.isSuccess()) {
                return Result.fail(Integer.parseInt(alipayResponse.getCode()),
                        alipayResponse.getMsg() + ":" + alipayResponse.getSubMsg());
            }
            T target = JSONUtil.toBean(alipayResponse.getBody(), respClazz);
            return Result.ok(target);
        } catch (Exception e) {
            throw new AlipayRentException(500, "支付宝调用异常", e);
        }
    }

    /**
     * 子类返回带具体泛型的 AlipayRequest，例如
     * AlipayCommerceRentOrderSignRequest
     */
    protected abstract AlipayRequest<? extends AlipayResponse> buildRequest(Req req);
}