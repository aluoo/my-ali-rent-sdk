package com.anyi.alipay.rent.model.order;

import com.alipay.api.domain.OpenApiRoyaltyDetailInfoPojo;
import com.alipay.api.domain.RefundGoodsDetail;
import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderTradeRefundRequest implements BaseRequest {

    @NotBlank private String outTradeNo;
    @NotBlank private String refundReason;

    private String outRequestNo;
    private List<RefundGoodsDetail> refundGoodsDetail;
    private List<OpenApiRoyaltyDetailInfoPojo> refundRoyaltyParameters;
    private List<String> queryOptions;
    private String relatedSettleConfirmNo;
}
