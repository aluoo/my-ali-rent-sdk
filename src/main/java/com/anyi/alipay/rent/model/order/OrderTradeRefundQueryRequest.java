package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderTradeRefundQueryRequest implements BaseRequest {

    @NotBlank private String outTradeNo;


    @NotBlank private String outRequestNo;

    /**
     * 【枚举值】
     * 本次退款使用的资金渠道: refund_detail_item_list
     * 退款执行成功的时间: gmt_refund_pay
     * 银行卡冲退信息: deposit_back_info
     * 本次交易使用的券信息: refund_voucher_detail_list
     */
    private List<String> queryOptions;
}
