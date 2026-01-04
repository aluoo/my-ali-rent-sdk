package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderFulfillmentFinishModel;
import com.alipay.api.request.AlipayCommerceRentOrderFulfillmentFinishRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentFinishRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentFinishResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderFulfillmentFinishHandler
        extends AbstractApiHandler<OrderFulfillmentFinishRequest, OrderFulfillmentFinishResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderFulfillmentFinishRequest req) {
        AlipayCommerceRentOrderFulfillmentFinishRequest  alipayReq = new AlipayCommerceRentOrderFulfillmentFinishRequest();
        AlipayCommerceRentOrderFulfillmentFinishModel  model = new AlipayCommerceRentOrderFulfillmentFinishModel();

        model.setStatus(req.getStatus());
        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
