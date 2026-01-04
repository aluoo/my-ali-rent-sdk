package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderAftersaleConfirmModel;
import com.alipay.api.request.AlipayCommerceRentOrderAftersaleConfirmRequest;
import com.anyi.alipay.rent.model.order.OrderAftersaleConfirmRequest;
import com.anyi.alipay.rent.model.order.OrderAftersaleConfirmResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

public class OrderAftersaleConfirmHandler
        extends AbstractApiHandler<OrderAftersaleConfirmRequest, OrderAftersaleConfirmResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderAftersaleConfirmRequest req) {
        AlipayCommerceRentOrderAftersaleConfirmRequest alipayReq = new AlipayCommerceRentOrderAftersaleConfirmRequest();
        AlipayCommerceRentOrderAftersaleConfirmModel model = new AlipayCommerceRentOrderAftersaleConfirmModel();

        /* 1. 基础字段 */
        model.setOperationType(req.getOperationType());
        model.setBuyerOpenId(req.getBuyerOpenId());
        model.setOutAftersaleId(req.getOutAftersaleId());

        /* 2. 条件必须 */
        model.setReasonCode(req.getReasonCode());
        model.setAdditionalDescription(req.getAdditionalDescription());
        model.setPayItems(req.getPayItems());
        model.setCompensationInfo(req.getCompensationInfo());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}