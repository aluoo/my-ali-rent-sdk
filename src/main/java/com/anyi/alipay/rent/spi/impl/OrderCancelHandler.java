package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderPayCancelModel;
import com.alipay.api.domain.AlipayCommerceRentOrderPayModel;
import com.alipay.api.request.AlipayCommerceRentOrderPayCancelRequest;
import com.alipay.api.request.AlipayCommerceRentOrderPayRequest;
import com.anyi.alipay.rent.model.order.OrderCancelRequest;
import com.anyi.alipay.rent.model.order.OrderCancelResponse;
import com.anyi.alipay.rent.model.order.OrderPayRequest;
import com.anyi.alipay.rent.model.order.OrderPayResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderCancelHandler
        extends AbstractApiHandler<OrderCancelRequest, OrderCancelResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderCancelRequest req) {
        AlipayCommerceRentOrderPayCancelRequest  alipayReq = new AlipayCommerceRentOrderPayCancelRequest();
        AlipayCommerceRentOrderPayCancelModel  model = new AlipayCommerceRentOrderPayCancelModel();

        /* 1. 基础字段 */
        model.setOutTradeNo(req.getOutTradeNo());
        model.setOrderId(req.getOrderId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}