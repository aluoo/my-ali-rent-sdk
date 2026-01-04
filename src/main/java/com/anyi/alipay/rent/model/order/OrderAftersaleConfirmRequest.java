package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.AftersaleCompensationInfoVO;
import com.alipay.api.domain.AftersalePayItemVO;
import com.alipay.api.domain.FulfillmentDeliveryInfo;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;
import org.bouncycastle.crypto.tls.PRFAlgorithm;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderAftersaleConfirmRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    /**
     * 商户同意申请: MERCHANT_APPROVE
     * 商户拒绝申请: MERCHANT_REJECT
     * 同意并需用户支付: APPROVE_WITH_USER_PAY
     * 撤销售后: USER_CANCEL_APPLY
     * 售后完结: AFTERSALE_FINISH
     * 【注意事项】私域场景：商家只需同步售后终态，即只会用到USER_CANCEL_APPLY和AFTERSALE_FINISH；
     * 公域场景：需要商家审核售后，因此只会用到MERCHANT_APPROVE、MERCHANT_REJECT和APPROVE_WITH_USER_PAY
     */
    @NotBlank private String operationType;
    @NotBlank private String buyerOpenId;
    @NotBlank private String outAftersaleId;

    /* ======== 条件必填 ======== */
    /**
     * 【枚举值】
     * 商品已发货: GOODS_DELIVERED
     * 与买家协商一致: BUYER_AGREED
     * 其他: OTHER
     * 用户提前归还违约: RETURN_EARLY
     * 用户逾期归还违约: RETURN_OVERDUE
     * 物品损坏赔付: ITEM_DAMAGED
     * 物品丢失赔付: ITEM_LOST
     * 物品维修赔付: ITEM_REPAIR
     * 物品折旧赔付: ITEM_DEPRECIATION
     * 收起
     * 【注意事项】当operation_type=MERCHANT_REJECT时，可传入GOODS_DELIVERED、BUYER_AGREED和OTHER；当operation_type=APPROVE_WITH_USER_PAY时，若pay_items费用类型为LATE_FEE时可传入RETURN_EARLY RETURN_OVERDUE，费用类型为INDEMNITY时可传入ITEM_DAMAGED、ITEM_LOST、ITEM_REPAIR和ITEM_DEPRECIATION
     * 【必选条件】当operation_type=MERCHANT_REJECT或operation_type=APPROVE_WITH_USER_PAY时必选
     */
    private String reasonCode;

    private String additionalDescription; //当reason_code=OTHER时必选

    private List<AftersalePayItemVO> payItems; //当operation_type=APPROVE_WITH_USER_PAY时必选

    private AftersaleCompensationInfoVO compensationInfo;   //当operation_type=APPROVE_WITH_USER_PAY时必选

}

