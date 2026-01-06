package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderModifyRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    /**
     * 【枚举值】
     * 租赁计划时间: RENT_PLAN_TIME
     * 用户收货地址: USER_ADDRESS
     * 商家退货地址: MERCHANT_RETURN_ADDRESS
     * 订单发货信息: DELIVERY_INFO
     */
    @NotBlank private String orderId;
    @NotBlank private String openId;


    /* ======== 条件必传 ======== */
    private OrderModifyRentPlanInfo rentPlanInfo;  //type = RENT_PLAN_TIME 时，必选
    private RentOrderReceiverAddressInfoDTO addressInfo; //type = USER_ADDRESS 时，必选; 或者 type = DELIVERY_INFO 并且 delivery_info.delivery_type = EXPRESS 时，必选； 或者 type = DELIVERY_INFO 并且 delivery_info.delivery_type = INTRA_CITY_EXPRESS 时，必选
    private RentOrderReceiverAddressInfoDTO defaultReceivingAddress; //type = MERCHANT_RETURN_ADDRESS 时，必选
    private RentOrderDeliveryInfoDTO deliveryInfo; //type = DELIVERY_INFO 时，必选
}