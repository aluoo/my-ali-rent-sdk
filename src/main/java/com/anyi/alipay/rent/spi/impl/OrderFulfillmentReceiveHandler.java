package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderFulfillmentReceiveModel;
import com.alipay.api.request.AlipayCommerceRentOrderFulfillmentReceiveRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentReceiveRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentReceiveResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderFulfillmentReceiveHandler
        extends AbstractApiHandler<OrderFulfillmentReceiveRequest, OrderFulfillmentReceiveResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderFulfillmentReceiveRequest req) {
        AlipayCommerceRentOrderFulfillmentReceiveRequest    alipayReq = new AlipayCommerceRentOrderFulfillmentReceiveRequest();
        AlipayCommerceRentOrderFulfillmentReceiveModel  model = new AlipayCommerceRentOrderFulfillmentReceiveModel();

        model.setType(req.getType());
        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
