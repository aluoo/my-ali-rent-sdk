package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.AftersalePayItemVO;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderAftersaleCreateRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    /**
     * 【枚举值】
     * 取消订单: ORDER_CANCEL
     * 赔付: COMPENSATION
     * 【注意事项】其中，如果售后类型是ORDER_CANCEL，则在售后单完结后，订单会自动推进订单状态至CLOSED；售后类型是COMPENSATION，在售后完结后不会推进订单状态
     */
    @NotBlank private String aftersaleType;
    @NotBlank private String orderId;
    @NotBlank private String buyerOpenId;
    @NotBlank private String outAftersaleId;

    /**
     * 【描述】发起售后原因，具体传入规则如下：
     * 1. 当aftersale_type=ORDER_CANCEL时，根据当前订单状态是「待发货」和「已发货」，可传入的原因类型不同：
     * 1.1. 已发货：可传入TIMEOUT_FOR_CONFIRM、LOGISTICS_ILLEGAL、REJECT_TO_CONFIRM、NO_NEED、BUYER_AGREED、OTHER；
     * 1.2. 待发货：可传入OTHER_CHANNEL_CHEAP、CHEAPER_ITEM、RENT_AMOUNT_OVER_PLAN、NO_NEED、NO_GOODS_OR_REJECT、NEED_TO_CHANGE_CHANNEL、NEED_TO_PAY_MANY_PERIOD_AMOUNT、CANNOT_CAONTACT_WITH_MERCHANT、OTHER。
     * 2. 当aftersale_type= COMPENSATION时，如果pay_items中金额类型为INDEMNITY，则可以传入ITEM_DAMAGED、ITEM_REPAIR、ITEM_LOST和ITEM_DEPRECIATION；如果金额类型为LATE_FEE，则可以传入RETURN_EARLY和RETURN_OVERDUE。
     */
    @NotBlank private String reasonCode;

    /* ======== 条件必填 ======== */
    private String additionalDescription; //当reason_code=OTHER时必选

    private List<AftersalePayItemVO> payItems; //当aftersale_type=COMPENSATION时必选

}

