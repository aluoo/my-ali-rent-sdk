package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayTradeRefundModel;
import com.alipay.api.request.AlipayTradeRefundRequest;
import com.anyi.alipay.rent.model.order.OrderTradeRefundRequest;
import com.anyi.alipay.rent.model.order.OrderTradeRefundResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderTradeRefundHandler
        extends AbstractApiHandler<OrderTradeRefundRequest, OrderTradeRefundResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderTradeRefundRequest req) {
        AlipayTradeRefundRequest alipayReq = new AlipayTradeRefundRequest();
        AlipayTradeRefundModel model = new AlipayTradeRefundModel();


        model.setOutRequestNo(req.getOutRequestNo());
        model.setRefundReason(req.getRefundReason());
        model.setOutTradeNo(req.getOutTradeNo());

        model.setRefundGoodsDetail(req.getRefundGoodsDetail());
        model.setRefundRoyaltyParameters(req.getRefundRoyaltyParameters());
        model.setQueryOptions(req.getQueryOptions());
        model.setRelatedSettleConfirmNo(req.getRelatedSettleConfirmNo());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
