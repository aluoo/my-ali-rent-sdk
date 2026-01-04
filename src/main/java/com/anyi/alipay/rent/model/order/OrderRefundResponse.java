package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class OrderRefundResponse implements BaseResponse {
    private String code;
    private String msg;

    private String tradeNo;
    private String outTradeNo;
    private String outRequestNo;
    private String orderId;
    private String refundAmount;
    private String status;// 退款中: INIT 退款成功: COMPLETED 退款关闭: CLOSE

}