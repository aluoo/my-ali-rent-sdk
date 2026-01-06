package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayFundAuthOperationDetailQueryModel;
import com.alipay.api.request.AlipayFundAuthOperationDetailQueryRequest;
import com.anyi.alipay.rent.model.order.OrderFundQueryRequest;
import com.anyi.alipay.rent.model.order.OrderFundQueryResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderFundQueryHandler
        extends AbstractApiHandler<OrderFundQueryRequest, OrderFundQueryResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderFundQueryRequest req) {
        AlipayFundAuthOperationDetailQueryRequest alipayReq = new AlipayFundAuthOperationDetailQueryRequest();
        AlipayFundAuthOperationDetailQueryModel model = new AlipayFundAuthOperationDetailQueryModel();

        model.setAuthNo(req.getAuthNo());
        model.setOutOrderNo(req.getOutOrderNo());
        model.setOperationId(req.getOperationId());
         model.setOutRequestNo(req.getOutRequestNo());
        model.setOperationType(req.getOperationType());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
