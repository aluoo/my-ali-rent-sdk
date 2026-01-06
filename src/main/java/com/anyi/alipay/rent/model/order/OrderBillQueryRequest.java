package com.anyi.alipay.rent.model.order;


import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderBillQueryRequest implements BaseRequest {

    @NotBlank private String billType;
    @NotBlank private String billDate;

    private String smid;
}
