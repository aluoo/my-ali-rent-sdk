package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class OrderQueryResponse implements BaseResponse {

    private String code;
    private String msg;
    private String orderId;
    private String outOrderId;
    private String orderType;
    private String status;
    private String title;

    private RentPathInfoDTO pathInfo;
    private String buyerId;
    private String buyerOpenId;
    private RentOrderPriceInfoDTO priceInfo;
    private RentPlanInfoDTO rentPlanInfo;
    private RentSignInfoDTO rentSignInfo;
    private String tradeAppId;
    private RentSubMerchantDTO subMerchant;
    private List<RentGoodsDetailInfoDTO> itemInfos;
    private RentOrderDeliveryInfoDTO deliveryInfo;
    private RentOrderReceiverAddressInfoDTO addressInfo;
    private RentOrderReceiverAddressInfoDTO defaultReceivingAddress;
    private String memo;
    private Date orderCreateTime;
    private List<RentOrderStatementInfoVO> rentStatementInfos;
    private RentPromoInfoVO promoInfo;
    private List<String> subOrderIds;
    private List<RentPayInfoDTO> rentPayInfos;
    private String faceVerifyResult;
    private String settleType;
    private List<RentAftersaleOrderVO> rentAftersaleOrders;
    private List<RentServiceTicketInfo> serviceTicketInfos;
    private RentFastAuditInfoVO fastAuditInfo;
    private RentOrderExtendInfoVO extendInfo;
    private List<RentRefundInfoVO> rentRefundInfos;
    private String outerOrderSource;
}
