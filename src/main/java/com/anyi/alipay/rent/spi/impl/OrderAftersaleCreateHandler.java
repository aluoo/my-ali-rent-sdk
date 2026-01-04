package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderAftersaleCreateModel;
import com.alipay.api.request.AlipayCommerceRentOrderAftersaleCreateRequest;
import com.anyi.alipay.rent.model.order.OrderAftersaleCreateRequest;
import com.anyi.alipay.rent.model.order.OrderAftersaleCreateResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderAftersaleCreateHandler
        extends AbstractApiHandler<OrderAftersaleCreateRequest, OrderAftersaleCreateResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderAftersaleCreateRequest req) {
        AlipayCommerceRentOrderAftersaleCreateRequest alipayReq = new AlipayCommerceRentOrderAftersaleCreateRequest();
        AlipayCommerceRentOrderAftersaleCreateModel model = new AlipayCommerceRentOrderAftersaleCreateModel();

        /* 1. 基础字段 */
        model.setAftersaleType(req.getAftersaleType());
        model.setOrderId(req.getOrderId());
        model.setBuyerOpenId(req.getBuyerOpenId());
        model.setOutAftersaleId(req.getOutAftersaleId());
        model.setReasonCode(req.getReasonCode());

        /* 2. 条件必须 */
        model.setAdditionalDescription(req.getAdditionalDescription());
        model.setPayItems(req.getPayItems());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}