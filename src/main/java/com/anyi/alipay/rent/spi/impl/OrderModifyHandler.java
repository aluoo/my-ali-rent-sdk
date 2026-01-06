package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderModifyModel;
import com.alipay.api.request.AlipayCommerceRentOrderModifyRequest;
import com.anyi.alipay.rent.model.order.OrderModifyRequest;
import com.anyi.alipay.rent.model.order.OrderModifyResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderModifyHandler
        extends AbstractApiHandler<OrderModifyRequest, OrderModifyResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderModifyRequest req) {
        AlipayCommerceRentOrderModifyRequest alipayReq = new AlipayCommerceRentOrderModifyRequest();
        AlipayCommerceRentOrderModifyModel model = new AlipayCommerceRentOrderModifyModel();

        model.setOrderId(req.getOrderId());
        model.setOpenId(req.getOpenId());
        model.setRentPlanInfo(req.getRentPlanInfo());
        model.setAddressInfo(req.getAddressInfo());
        model.setDefaultReceivingAddress(req.getDefaultReceivingAddress());
        model.setDeliveryInfo(req.getDeliveryInfo());


        alipayReq.setBizModel(model);
        return alipayReq;
    }
}
