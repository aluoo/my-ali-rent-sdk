package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderTradeQueryResponse implements BaseResponse {
    private String code;
    private String msg;

    private String outTradeNo;
    private String tradeStatus;
    private String totalAmount;
    private List<GoodsDetail> reqGoodsDetail;
    private String periodScene;
    private String transCurrency;

    private String settleCurrency;
    private BigDecimal settleAmount;
    private String payCurrency;
    private String payAmount;
    private String settleTransRate;
    private String transPayRate;
    private BigDecimal invoiceAmount;
    private BigDecimal buyerPayAmount;
    private BigDecimal pointAmount;
    private Date sendPayDate;
    private String receiptAmount;
    private String storeId;
    private String terminalId;
    private String storeName;
    private String buyerUserId;
    private String buyerOpenId;
    private String chargeAmount;
    private String chargeFlags;
    private String settlementId;
    private TradeSettleInfo tradeSettleInfo;
    private String authTradePayMode;
    private String discountAmount;
    private String subject;
    private String body;
    private String alipaySubMerchantId;
    private String extInfos;
    private String buyerUserType;
    private String mdiscountAmount;
    private HbFqPayInfo hbFqPayInfo;
    private List<FulfillmentDetail> fulfillmentDetailList;
    private String preAuthPayAmount;
    private String purchaseEntity;
    private String tradeNo;
    private String buyerLogonId;
    private String additionalStatus;
    private List<TradeFundBill> fundBillList;
    private String passbackParams;
    private String creditPayMode;
    private String creditBizOrderId;
    private String hybAmount;
    private BkAgentRespInfo bkagentRespInfo;
    private String bizSettleMode;
    private String asyncPayApplyStatus;
    private String cashierType;
    private String tapPayInfo;
}
