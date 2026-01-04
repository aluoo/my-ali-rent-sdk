package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderFulfillmentSendModel;
import com.alipay.api.request.AlipayCommerceRentOrderFulfillmentSendRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentSendRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentSendResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderFulfillmentSendHandler
        extends AbstractApiHandler<OrderFulfillmentSendRequest, OrderFulfillmentSendResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderFulfillmentSendRequest req) {
        AlipayCommerceRentOrderFulfillmentSendRequest   alipayReq = new AlipayCommerceRentOrderFulfillmentSendRequest();
        AlipayCommerceRentOrderFulfillmentSendModel  model = new AlipayCommerceRentOrderFulfillmentSendModel();

        model.setType(req.getType());
        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());

        model.setDeliveryList(req.getDeliveryList());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
