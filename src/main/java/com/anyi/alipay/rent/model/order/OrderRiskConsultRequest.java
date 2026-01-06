package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class OrderRiskConsultRequest implements BaseRequest {

    /**
     * 【枚举值】
     * 租赁订单场景: RENT_ORDER
     */
    @NotBlank private String riskBizScene;

    /**
     * 该笔订单必须已经成功创建了对应的交易组件订单
     */
    @NotBlank private String outBizNo;

    /** 支付宝openid */
    @NotBlank private String alipayOpenId;

    /**
     * 【枚举值】
     * 共租风险（免费版）: CONCURRENT_RENT
     * 共租风险（专业版）: CONCURRENT_RENT_PRO
     * 租安盾-综合风险等级: COMPREHENSIVE_RISK
     * 发货建议: SHIP_GOODS_RISK
     * 租安盾综合风险等级与共租风险专业版，需要签署对应的付费合约才可以查询
     */

    private List<String> consultRiskTypes;
}