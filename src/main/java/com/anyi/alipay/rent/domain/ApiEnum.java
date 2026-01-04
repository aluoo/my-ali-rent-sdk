package com.anyi.alipay.rent.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ApiEnum {

    /** 订单创建 */
    ORDER_SIGN("alipay.commerce.rent.order.sign", "租赁订单签约"),
    ORDER_QUERY("alipay.commerce.rent.order.query", "租赁订单查询"),
    ORDER_CREATE("alipay.commerce.rent.order.create", "租赁订单创建"),
    ORDER_CLOSE("alipay.commerce.rent.order.close", "租赁订单关闭"),

    /** 订单支付 */
    ORDER_PAY("alipay.commerce.rent.order.pay", "租赁订单支付"),
    ORDER_CANCEL("alipay.commerce.rent.order.pay.cancel", "租赁订单取消"),
    ORDER_SYNC("alipay.commerce.rent.order.pay.sync", "租赁订单支付主动同步"),
    ORDER_REFUND("alipay.commerce.rent.order.pay.refund", "租赁订单支付退款"),

    /** 订单履约 */
    ORDER_FULFILLMENT_APPROVE("alipay.commerce.rent.order.fulfillment.approve", "履约订单商家审核通过"),
    ORDER_FULFILLMENT_SEND("alipay.commerce.rent.order.fulfillment.send", "履约订单物流发货"),
    ORDER_FULFILLMENT_RECEIVE("alipay.commerce.rent.order.fulfillment.receive", "履约订单确认收货"),
    ORDER_FULFILLMENT_FINISH("alipay.commerce.rent.order.fulfillment.finish", "履约订单完成"),

    /** 订单售后 */
    ORDER_AFTERSALE_CONFIRM("alipay.commerce.rent.order.aftersale.confirm", "租赁订单售后处理"),
    ORDER_AFTERSALE_CREATE("alipay.commerce.rent.order.aftersale.create", "租赁售后单创建"),


    ;

    private final String method;
    private final String desc;
}