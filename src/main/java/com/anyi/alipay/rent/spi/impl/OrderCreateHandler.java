package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayRequest;
import com.alipay.api.domain.AlipayCommerceRentOrderCreateModel;
import com.alipay.api.request.AlipayCommerceRentOrderCreateRequest;
import com.alipay.api.domain.*;
import com.anyi.alipay.rent.model.order.OrderCreateRequest;
import com.anyi.alipay.rent.model.order.OrderCreateResponse;
import com.anyi.alipay.rent.spi.AbstractApiHandler;

/**
 * 租赁订单创建 -> alipay.commerce.rent.order.create
 */
public class OrderCreateHandler
        extends AbstractApiHandler<OrderCreateRequest, OrderCreateResponse> {

    @Override
    protected AlipayRequest<?> buildRequest(OrderCreateRequest req) {
        AlipayCommerceRentOrderCreateRequest alipayReq = new AlipayCommerceRentOrderCreateRequest();
        AlipayCommerceRentOrderCreateModel model = new AlipayCommerceRentOrderCreateModel();

        /* 1. 基础字段 */
        model.setOutOrderId(req.getOutOrderId());
        model.setOrderType(req.getOrderType());
        model.setTitle(req.getTitle());
        model.setBuyerOpenId(req.getBuyerOpenId());
        model.setMemo(req.getMemo());
        model.setSourceId(req.getSourceId());
        model.setTradeAppId(req.getTradeAppId());

        /* 2. 子级 DTO */
        model.setPathInfo(req.getPathInfo());
        model.setPriceInfo(req.getPriceInfo());
        model.setRentPlanInfo(req.getRentPlanInfo());
        model.setRentSignInfo(req.getRentSignInfo());
        model.setItemInfos(req.getItemInfos());
        model.setAddressInfo(req.getAddressInfo());
        model.setDefaultReceivingAddress(req.getDefaultReceivingAddress());
        model.setSubMerchant(req.getSubMerchant());

        /* 3. 条件必传字段 */
        model.setReletInfo(req.getReletInfo());
        model.setBuyoutInfo(req.getBuyoutInfo());
        model.setSupplementaryInfo(req.getSupplementaryInfo());

        alipayReq.setBizModel(model);
        return alipayReq;
    }
}