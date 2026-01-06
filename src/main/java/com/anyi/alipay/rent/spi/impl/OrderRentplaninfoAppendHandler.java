package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderRentplaninfoAppendModel;
import com.alipay.api.request.AlipayCommerceRentOrderRentplaninfoAppendRequest;
import com.anyi.alipay.rent.model.order.OrderRentplaninfoAppendRequest;
import com.anyi.alipay.rent.model.order.OrderRentplaninfoAppendResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderRentplaninfoAppendHandler
        extends AbstractApiHandler<OrderRentplaninfoAppendRequest, OrderRentplaninfoAppendResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderRentplaninfoAppendRequest req) {
        AlipayCommerceRentOrderRentplaninfoAppendRequest alipayReq = new AlipayCommerceRentOrderRentplaninfoAppendRequest();
        AlipayCommerceRentOrderRentplaninfoAppendModel model = new AlipayCommerceRentOrderRentplaninfoAppendModel();

        model.setType(req.getType());
        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());
        model.setRentEndTime(req.getRent_end_time());

        model.setInstallments(req.getInstallments());
        model.setCancelInfo(req.getCancelInfo());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
