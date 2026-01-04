package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class OrderCancelResponse implements BaseResponse {
    private String code;
    private String msg;

    private String outTradeNo;
    private String orderId;
    private String payAmount;
}