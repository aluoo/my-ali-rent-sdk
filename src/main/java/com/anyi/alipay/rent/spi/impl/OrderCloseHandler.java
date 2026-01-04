package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderCloseModel;
import com.alipay.api.request.AlipayCommerceRentOrderCloseRequest;
import com.anyi.alipay.rent.model.order.OrderCloseRequest;
import com.anyi.alipay.rent.model.order.OrderCloseResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderCloseHandler
        extends AbstractApiHandler<OrderCloseRequest, OrderCloseResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderCloseRequest req) {
        AlipayCommerceRentOrderCloseRequest alipayReq = new AlipayCommerceRentOrderCloseRequest();
        AlipayCommerceRentOrderCloseModel model = new AlipayCommerceRentOrderCloseModel();
        model.setReasonCode(req.getReasonCode());
        model.setReasonDesc(req.getReasonDesc());
        model.setOrderId(req.getOrderId());
        model.setBuyerOpenId(req.getBuyerOpenId());
        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
