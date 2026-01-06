package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderFundQueryResponse implements BaseResponse {
    private String code;
    private String msg;


    private String authNo;
    private String outOrderNo;
    private String orderStatus;
    private BigDecimal totalFreezeAmount;
    private BigDecimal restAmount;
    private BigDecimal totalPayAmount;
    private String orderTitle;
    private String operationId;
    private String outRequestNo;
    private BigDecimal amount;
    private String operationType;
    private String status;
    private String remark;
    private Date gmtCreate;
    private String payerUserId;
    private String payerOpenId;


    private String extraParam;
    private String preAuthType;
    private String transCurrency;
    private BigDecimal totalFreezeCreditAmount;
    private BigDecimal totalFreezeFundAmount;
    private BigDecimal totalPayCreditAmount;
    private BigDecimal totalPayFundAmount;
    private BigDecimal restCreditAmount;
    private BigDecimal restFundAmount;
    private BigDecimal creditAmount;
    private BigDecimal fundAmount;
    private String creditMerchantExt;

    private String payerLogonId;
    private Date gmtTrans;
}
