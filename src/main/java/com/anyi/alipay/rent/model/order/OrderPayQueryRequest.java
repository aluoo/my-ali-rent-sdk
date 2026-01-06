package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderPayQueryRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String outTradeNo;
    @NotBlank private String buyerId;
    @NotBlank private String orderId;

}

