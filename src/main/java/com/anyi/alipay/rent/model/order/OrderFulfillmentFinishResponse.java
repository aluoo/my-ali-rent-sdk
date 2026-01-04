package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class OrderFulfillmentFinishResponse implements BaseResponse {
    private String code;
    private String msg;
}
