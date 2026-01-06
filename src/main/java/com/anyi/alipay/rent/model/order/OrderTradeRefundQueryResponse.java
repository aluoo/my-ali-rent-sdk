package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderTradeRefundQueryResponse implements BaseResponse {
    private String code;
    private String msg;

    private String tradeNo;
    private String outTradeNo;
    private String outRequestNo;
    private BigDecimal totalAmount;
    private BigDecimal refundAmount;
    private String refundStatus;
    private List<RefundRoyaltyResult> refundRoyaltys;
    private Date gmtRefundPay;
    private List<TradeFundBill> refundDetailItemList;
    private String sendBackFee;
    private DepositBackInfo depositBackInfo;
    private List<VoucherDetail> refundVoucherDetailList;
    private String preAuthCancelFee;
    private String refundHybAmount;
    private List<RefundChargeInfo> refundChargeInfoList;
    private List<DepositBackInfo> depositBackInfoList;

}
