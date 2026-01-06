package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentRiskConsultModel;
import com.alipay.api.request.AlipayCommerceRentRiskConsultRequest;
import com.anyi.alipay.rent.model.order.*;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderRiskConsultHandler
        extends AbstractApiHandler<OrderRiskConsultRequest, OrderRiskConsultResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderRiskConsultRequest req) {
        AlipayCommerceRentRiskConsultRequest alipayReq = new AlipayCommerceRentRiskConsultRequest();
        AlipayCommerceRentRiskConsultModel model = new AlipayCommerceRentRiskConsultModel();


        model.setOutBizNo(req.getOutBizNo());
        model.setAlipayOpenId(req.getAlipayOpenId());
        model.setRiskBizScene(req.getRiskBizScene());
        model.setConsultRiskTypes(req.getConsultRiskTypes());


        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
