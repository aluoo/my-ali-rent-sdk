package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderQueryModel;
import com.alipay.api.request.AlipayCommerceRentOrderQueryRequest;
import com.anyi.alipay.rent.model.order.OrderQueryRequest;
import com.anyi.alipay.rent.model.order.OrderQueryResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderQueryHandler
        extends AbstractApiHandler<OrderQueryRequest, OrderQueryResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderQueryRequest req) {
        AlipayCommerceRentOrderQueryRequest alipayReq = new AlipayCommerceRentOrderQueryRequest();
        AlipayCommerceRentOrderQueryModel model = new AlipayCommerceRentOrderQueryModel();
        model.setOrderId(req.getOrderId());
        model.setBuyerOpenId(req.getBuyerOpenId());
        model.setQueryOptions(req.getQueryOptions());
        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
