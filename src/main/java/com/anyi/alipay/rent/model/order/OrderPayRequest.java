package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderPayRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String outTradeNo;
    @NotBlank private String orderId;
    @NotBlank private String payAmount;
    @NotBlank private String payMethod;


    /* ======== 可选 ======== */
    private String payNotifyUrl;
    private String payTimeoutExpress;
    private RentSubMerchantDTO subMerchant;

    /* ======== 条件必传 ======== */
    private List<RentPayItemDTO> payItems;              // 当order_type是 普通租赁: RENT、续租: RELET、购买: BUYOUT 时必选
    private String aftersaleId;             // pay_items中包含违约金或赔付金时必传

}

