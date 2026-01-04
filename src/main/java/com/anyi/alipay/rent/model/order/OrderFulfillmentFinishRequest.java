package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.FulfillmentDeliveryInfo;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderFulfillmentFinishRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String status;  //用户租赁到期，已经归还商品: USER_RETURNED 其他场景下完结订单（无需归还）: OTHER 用户提前完成归还: USER_RETURNED_IN_ADVANCE
    @NotBlank private String orderId;
    @NotBlank private String openId;


}

