package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.RentPayItemDTO;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

@Data
public class OrderSyncRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String outTradeNo;
    @NotBlank private String orderId;
    @NotBlank private List<RentPayItemDTO> payItems;
    @NotBlank private String payChannel;

    /* ======== 可选 ======== */
    private Date payTime;

    /* ======== 条件必填 ======== */
    private String tradeNo; // pay_channel=ALIPAY时必传
    private String aftersaleId; // pay_items中包含违约金或赔付金时必传

}

