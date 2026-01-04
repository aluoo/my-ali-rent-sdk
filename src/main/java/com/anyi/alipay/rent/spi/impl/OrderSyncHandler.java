package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderPaySyncModel;
import com.alipay.api.request.AlipayCommerceRentOrderPaySyncRequest;
import com.anyi.alipay.rent.model.order.OrderSyncRequest;
import com.anyi.alipay.rent.model.order.OrderSyncResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderSyncHandler
        extends AbstractApiHandler<OrderSyncRequest, OrderSyncResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderSyncRequest req) {
        AlipayCommerceRentOrderPaySyncRequest   alipayReq = new AlipayCommerceRentOrderPaySyncRequest();
        AlipayCommerceRentOrderPaySyncModel   model = new AlipayCommerceRentOrderPaySyncModel();

        /* 1. 基础字段 */
        model.setOutTradeNo(req.getOutTradeNo());
        model.setOrderId(req.getOrderId());
        model.setPayChannel(req.getPayChannel());
        model.setPayItems(req.getPayItems());

        /* 2. 可选 */
        model.setPayTime(req.getPayTime());
        /* 3. 条件必传 */
        model.setAftersaleId(req.getAftersaleId());
        model.setTradeNo(req.getTradeNo());


        alipayReq.setBizModel(model);
        return alipayReq;
    }
}