package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderFulfillmentApproveModel;
import com.alipay.api.request.AlipayCommerceRentOrderFulfillmentApproveRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentApproveRequest;
import com.anyi.alipay.rent.model.order.OrderFulfillmentApproveResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderFulfillmentApproveHandler
        extends AbstractApiHandler<OrderFulfillmentApproveRequest, OrderFulfillmentApproveResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderFulfillmentApproveRequest req) {
        AlipayCommerceRentOrderFulfillmentApproveRequest  alipayReq = new AlipayCommerceRentOrderFulfillmentApproveRequest();
        AlipayCommerceRentOrderFulfillmentApproveModel model = new AlipayCommerceRentOrderFulfillmentApproveModel ();

        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
