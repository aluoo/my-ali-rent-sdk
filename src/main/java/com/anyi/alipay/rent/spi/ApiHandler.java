package com.anyi.alipay.rent.spi;

import com.alipay.api.AlipayClient;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.model.common.BaseResponse;
import com.anyi.alipay.rent.model.common.Result;

public interface ApiHandler {
    <T extends BaseResponse> Result<T> execute(AlipayClient client,
                                               BaseRequest request,
                                               Class<T> respClazz);
}