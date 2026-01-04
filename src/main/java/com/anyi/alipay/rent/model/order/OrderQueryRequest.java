package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderQueryRequest implements BaseRequest {
    /** 交易组件订单号 必填 */
    @NotBlank
    private String orderId;

    /** 买家支付宝 openId 必填 */
    @NotBlank
    private String buyerOpenId;

    /** 查询选项 可选 默认 ["statement_info"] */
    private List<String> queryOptions;
}
