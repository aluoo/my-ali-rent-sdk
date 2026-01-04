package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.FulfillmentDeliveryInfo;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderFulfillmentSendRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String type;  //商家发货: MERCHANT_DELIVERY_SEND 用户寄回: USER_DELIVERY_SEND
    @NotBlank private String orderId;
    @NotBlank private String openId;


    private List<FulfillmentDeliveryInfo> deliveryList; //当创建租赁订单，选择快递物流或者同城配送，则发货时物流信息必填

}

