package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderPayQueryModel;
import com.alipay.api.request.AlipayCommerceRentOrderPayQueryRequest;
import com.anyi.alipay.rent.model.order.OrderPayQueryRequest;
import com.anyi.alipay.rent.model.order.OrderPayResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderPayQueryHandler
        extends AbstractApiHandler<OrderPayQueryRequest, OrderPayResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderPayQueryRequest req) {
        AlipayCommerceRentOrderPayQueryRequest alipayReq = new AlipayCommerceRentOrderPayQueryRequest();
        AlipayCommerceRentOrderPayQueryModel model = new AlipayCommerceRentOrderPayQueryModel();

        model.setOrderId(req.getOrderId());
        model.setOutTradeNo(req.getOutTradeNo());
        model.setBuyerId(req.getBuyerId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
