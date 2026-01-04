package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.FulfillmentDeliveryInfo;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderFulfillmentReceiveRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String type;  //商家发货，用户已经收货: MERCHANT_DELIVERY_RECEIVED  用户寄回，商家已经收货: USER_DELIVERY_RECEIVED
    @NotBlank private String orderId;
    @NotBlank private String openId;


}

