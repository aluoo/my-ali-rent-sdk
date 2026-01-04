package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderCloseRequest implements BaseRequest {
    /** 关单原因编码 必填 */
    @NotBlank
    private String reasonCode;

    /** 关单原因说明 必填 */
    @NotBlank
    private String reasonDesc;

    /** 交易组件订单号 必填 */
    @NotBlank
    private String orderId;

    /** 买家支付宝 openId 必填 */
    @NotBlank
    private String buyerOpenId;
}