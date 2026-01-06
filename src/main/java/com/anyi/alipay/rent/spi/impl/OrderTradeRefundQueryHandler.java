package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;

import com.alipay.api.domain.AlipayTradeFastpayRefundQueryModel;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.anyi.alipay.rent.model.order.OrderTradeRefundQueryRequest;
import com.anyi.alipay.rent.model.order.OrderTradeRefundQueryResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;


public class OrderTradeRefundQueryHandler
        extends AbstractApiHandler<OrderTradeRefundQueryRequest, OrderTradeRefundQueryResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderTradeRefundQueryRequest req) {
        AlipayTradeFastpayRefundQueryRequest  alipayReq = new AlipayTradeFastpayRefundQueryRequest();
        AlipayTradeFastpayRefundQueryModel model = new AlipayTradeFastpayRefundQueryModel();

        model.setOutRequestNo(req.getOutRequestNo());
        model.setOutTradeNo(req.getOutTradeNo());
        model.setQueryOptions(req.getQueryOptions());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
