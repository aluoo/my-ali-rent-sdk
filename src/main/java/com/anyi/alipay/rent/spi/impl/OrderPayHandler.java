package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderPayModel;
import com.alipay.api.request.AlipayCommerceRentOrderPayRequest;
import com.anyi.alipay.rent.model.order.OrderPayRequest;
import com.anyi.alipay.rent.model.order.OrderPayResponse;   // ← 我们自己的
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderPayHandler
        extends AbstractApiHandler<OrderPayRequest, OrderPayResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderPayRequest req) {
        AlipayCommerceRentOrderPayRequest alipayReq = new AlipayCommerceRentOrderPayRequest();
        AlipayCommerceRentOrderPayModel model = new AlipayCommerceRentOrderPayModel();

        /* 1. 基础字段 */
        model.setOutTradeNo(req.getOutTradeNo());
        model.setOrderId(req.getOrderId());
        model.setPayMethod(req.getPayMethod());
        model.setPayAmount(req.getPayAmount());
        model.setPayNotifyUrl(req.getPayNotifyUrl());
        model.setPayTimeoutExpress(req.getPayTimeoutExpress());
        model.setSubMerchant(req.getSubMerchant());

        /* 2. 天剑必传 */
        model.setPayItems(req.getPayItems());
        model.setAftersaleId(req.getAftersaleId());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}