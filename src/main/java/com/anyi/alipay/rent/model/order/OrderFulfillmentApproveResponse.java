package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class OrderFulfillmentApproveResponse implements BaseResponse {
    private String code;
    private String msg;
}
