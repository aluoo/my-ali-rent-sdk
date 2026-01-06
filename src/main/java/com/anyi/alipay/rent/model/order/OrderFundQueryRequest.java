package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderFundQueryRequest implements BaseRequest {

    /**
     * 授权号
     */
    private String authNo;

    /**
     * 商户订单号
     */
    private String outOrderNo;

    /**
     * 操作ID
     */
    private String operationId;

    /**
     * 商户请求号
     */
    private String outRequestNo;

    /**
     * 操作类型
     */
    private String operationType;
}
