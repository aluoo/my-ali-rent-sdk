package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayTradeQueryModel;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.anyi.alipay.rent.model.order.OrderTradeQueryRequest;
import com.anyi.alipay.rent.model.order.OrderTradeQueryResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderTradeQueryHandler
        extends AbstractApiHandler<OrderTradeQueryRequest, OrderTradeQueryResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderTradeQueryRequest req) {
        AlipayTradeQueryRequest alipayReq = new AlipayTradeQueryRequest();
        AlipayTradeQueryModel model = new AlipayTradeQueryModel();

        model.setOutTradeNo(req.getOutTradeNo());
        model.setOrgPid(req.getOrgPid());
        model.setQueryOptions(req.getQueryOptions());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
