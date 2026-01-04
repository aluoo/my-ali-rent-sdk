package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.*;
import com.alipay.api.request.AlipayCommerceRentOrderSignRequest;
import com.anyi.alipay.rent.model.order.OrderSignRequest;
import com.anyi.alipay.rent.model.order.OrderSignResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;
import cn.hutool.core.bean.BeanUtil;

public class OrderSignHandler
        extends AbstractApiHandler<OrderSignRequest, OrderSignResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderSignRequest req) {
        AlipayCommerceRentOrderSignRequest alipayReq = new AlipayCommerceRentOrderSignRequest();
        AlipayCommerceRentOrderSignModel model = new AlipayCommerceRentOrderSignModel();

        /* 1. 基础字段 */
        model.setOrderId(req.getOrderId());
        model.setNeedFaceValidateFlag(req.getNeedFaceValidateFlag());

        /* 2. rent_sign_info 子树 */
        RentDoSignInfoDTO signInfo = new RentDoSignInfoDTO();
        // 2.1 代扣
        if (req.getRentSignInfo().getRentDeductInfo() != null) {
            RentSignDeductInfoDTO deduct = new RentSignDeductInfoDTO();
            deduct.setSignScene(req.getRentSignInfo().getRentDeductInfo().getSignScene());
            signInfo.setRentDeductInfo(deduct);
        }
        // 2.2 免押
        if (req.getRentSignInfo().getFundAuthFreezeInfo() != null) {
            RentSignFundAuthFreezeInfoDTO freeze = new RentSignFundAuthFreezeInfoDTO();
            BeanUtil.copyProperties(req.getRentSignInfo().getFundAuthFreezeInfo(), freeze);
            signInfo.setFundAuthFreezeInfo(freeze);
        }
        model.setRentSignInfo(signInfo);

        /* 3. credit_ext_info */
        if (req.getCreditExtInfo() != null) {
            RentCreditExtInfoDTO credit = new RentCreditExtInfoDTO();
            credit.setFeeRiskModel(req.getCreditExtInfo().getFeeRiskModel());
            model.setCreditExtInfo(credit);
        }

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}