package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderTradeRefundResponse implements BaseResponse {
    private String code;
    private String msg;

    private String outTradeNo;
    private String tradeNo;
    private String buyerLogonId;
    private BigDecimal refundFee;

    private List<TradeFundBill> refundDetailItemList;
    private String storeName;
    private String buyerUserId;

    private String buyerOpenId;
    private String sendBackFee;
    private String preAuthCancelFee;
    private String fundChange;
    private String refundHybAmount;
    private List<RefundChargeInfo> refundChargeInfoList;
    private List<VoucherDetail> refundVoucherDetailList;

}
