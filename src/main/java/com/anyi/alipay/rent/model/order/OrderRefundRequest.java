package com.anyi.alipay.rent.model.order;


import com.alipay.api.domain.RentRefundItemDTO;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderRefundRequest implements BaseRequest {

    /* ======== 基础必填 ======== */
    @NotBlank private String outRequestNo;
    @NotBlank private String orderId;
    @NotBlank private String refundAmount;
    @NotBlank private String outTradeNo;

    /* ======== 可选 ======== */
    private String refundReason;

    /* ======== 条件必传 ======== */
    private List<RentRefundItemDTO> refundItems;           // 当租赁支付订单部分退款时，必填对应退款费用项明细

}

