package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class OrderSignRequest implements BaseRequest {

    /** 交易组件订单号 必填 */
    @NotBlank
    private String orderId;

    /** 租赁订单支付及信用产品签约信息 必填 */
    @NotBlank
    private RentDoSignInfoDTO rentSignInfo;

    /** 是否需要人脸核身 默认 true */
    private Boolean needFaceValidateFlag = true;

    /** 芝麻信用拓展信息 可选 */
    private RentCreditExtInfoDTO creditExtInfo;



    @Data
    public static class RentDoSignInfoDTO {
        private RentSignDeductInfoDTO rentDeductInfo;
        private RentSignFundAuthFreezeInfoDTO fundAuthFreezeInfo;
    }

    @Data
    public static class RentSignDeductInfoDTO {
        /** 固定 RENT_DEDUCT */
        private String signScene = "RENT_DEDUCT";
    }

    @Data
    public static class RentSignFundAuthFreezeInfoDTO {
        private String riskAssessmentPrice;
        private String riskSchemeId;
    }

    @Data
    public static class RentCreditExtInfoDTO {
        private String feeRiskModel;
    }
}