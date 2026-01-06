package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.RentTradeFundBillVO;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.util.Date;

@Data
public class OrderPayQueryResponse implements BaseResponse {
    private String code;
    private String msg;

    private String tradeStatus;
    private String outTradeNo;
    private String tradeNo;
    private String totalAmount;
    private String additionalStatus;
    private Date sendPayDate;
    private String buyerPayAmount;

    private String buyer_user_id;
    private String receiptAmount;
    private String discountAmount;
    private String mdiscountAmount;
    private RentTradeFundBillVO fund_bill_list;
}