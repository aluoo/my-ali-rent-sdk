package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderCreateRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String outOrderId;
    @NotBlank private String orderType;
    @NotBlank private String title;
    @NotBlank private RentPathInfoDTO pathInfo;
    @NotBlank private RentOrderPriceInfoDTO priceInfo;
    @NotBlank private String buyerOpenId;

    /* ======== 条件必传 ======== */
    private String sourceId;
    private RentPlanInfoDTO rentPlanInfo;
    private RentSignInfoDTO rentSignInfo;
    private List<RentGoodsDetailInfoDTO> itemInfos;
    private RentOrderReceiverAddressInfoDTO addressInfo;
    private RentOrderReceiverAddressInfoDTO defaultReceivingAddress;
    private RentSubMerchantDTO subMerchant;
    private String tradeAppId;
    private String memo;

    /* ======== 业务类型条件 ======== */
    private RentReletInfoDTO reletInfo;               // orderType=RELET 时必传
    private RentBuyoutInfoDTO buyoutInfo;             // orderType=BUYOUT 时必传
    private RentSupplementaryInfoDTO supplementaryInfo; // order_type=SUPPLEMENTARY 时必传
}