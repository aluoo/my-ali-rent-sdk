package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderTradeQueryRequest implements BaseRequest {

    @NotBlank private String outTradeNo;


    private String orgPid;

    /**
     * 【枚举值】
     * 交易结算信息: trade_settle_info
     * 交易支付使用的资金渠道: fund_bill_list
     * 交易支付时使用的所有优惠券信息: voucher_detail_list
     * 交易支付使用单品券优惠的商品优惠信息: discount_goods_detail
     * 商家优惠金额: mdiscount_amount
     * 医保信息: medical_insurance_info
     * 碰一下支付信息: tap_pay_info
     */
    private List<String> queryOptions;
}
