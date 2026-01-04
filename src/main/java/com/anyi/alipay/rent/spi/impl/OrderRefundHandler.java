package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderPayCancelModel;
import com.alipay.api.domain.AlipayCommerceRentOrderPayRefundModel;
import com.alipay.api.request.AlipayCommerceRentOrderPayCancelRequest;
import com.alipay.api.request.AlipayCommerceRentOrderPayRefundRequest;
import com.anyi.alipay.rent.model.order.OrderCancelRequest;
import com.anyi.alipay.rent.model.order.OrderCancelResponse;
import com.anyi.alipay.rent.model.order.OrderRefundRequest;
import com.anyi.alipay.rent.model.order.OrderRefundResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderRefundHandler
        extends AbstractApiHandler<OrderRefundRequest, OrderRefundResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderRefundRequest req) {
        AlipayCommerceRentOrderPayRefundRequest alipayReq = new AlipayCommerceRentOrderPayRefundRequest ();
        AlipayCommerceRentOrderPayRefundModel   model = new AlipayCommerceRentOrderPayRefundModel();

        /* 1. 基础字段 */
        model.setOutTradeNo(req.getOutTradeNo());
        model.setOrderId(req.getOrderId());
        model.setRefundAmount(req.getRefundAmount());
        model.setOutRequestNo(req.getOutRequestNo());


        /* 2. 可选字段 */
        model.setRefundReason(req.getRefundReason());
        /* 3. 条件必须 */
        model.setRefundItems(req.getRefundItems());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}