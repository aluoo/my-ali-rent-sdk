package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayDataDataserviceBillDownloadurlQueryModel;
import com.alipay.api.domain.AlipayTradeQueryModel;
import com.alipay.api.request.AlipayDataDataserviceBillDownloadurlQueryRequest;
import com.alipay.api.request.AlipayTradeQueryRequest;
import com.anyi.alipay.rent.model.order.OrderBillQueryRequest;
import com.anyi.alipay.rent.model.order.OrderBillQueryResponse;
import com.anyi.alipay.rent.model.order.OrderTradeQueryRequest;
import com.anyi.alipay.rent.model.order.OrderTradeQueryResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderBillQueryHandler
        extends AbstractApiHandler<OrderBillQueryRequest, OrderBillQueryResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderBillQueryRequest req) {
        AlipayDataDataserviceBillDownloadurlQueryRequest  alipayReq = new AlipayDataDataserviceBillDownloadurlQueryRequest();
        AlipayDataDataserviceBillDownloadurlQueryModel model = new AlipayDataDataserviceBillDownloadurlQueryModel();

        model.setBillDate(req.getBillDate());
        model.setBillType(req.getBillType());
        model.setSmid(req.getSmid());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
