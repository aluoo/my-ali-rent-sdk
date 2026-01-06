package com.anyi.alipay.rent.spi;

import com.anyi.alipay.rent.domain.ApiEnum;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.spi.impl.*;

import java.util.EnumMap;
import java.util.Map;

public final class HandlerFactory {
    private static final Map<ApiEnum, ApiHandler> REPO = new EnumMap<>(ApiEnum.class);

    static {
        /* 手工注册 */
        REPO.put(ApiEnum.USER_LOGIN, new UserLoginHandler());
        REPO.put(ApiEnum.USER_INFO, new UserInfoHandler());

        REPO.put(ApiEnum.ORDER_SIGN, new OrderSignHandler());
        REPO.put(ApiEnum.ORDER_QUERY, new OrderQueryHandler());
        REPO.put(ApiEnum.ORDER_CREATE, new OrderCreateHandler());
        REPO.put(ApiEnum.ORDER_CLOSE, new OrderCloseHandler());

        REPO.put(ApiEnum.ORDER_PAY, new OrderPayHandler());
        REPO.put(ApiEnum.ORDER_CANCEL, new OrderCancelHandler());
        REPO.put(ApiEnum.ORDER_SYNC, new OrderSyncHandler());
        REPO.put(ApiEnum.ORDER_REFUND, new OrderRefundHandler());

        REPO.put(ApiEnum.ORDER_FULFILLMENT_APPROVE, new OrderFulfillmentApproveHandler());
        REPO.put(ApiEnum.ORDER_FULFILLMENT_SEND, new OrderFulfillmentSendHandler());
        REPO.put(ApiEnum.ORDER_FULFILLMENT_RECEIVE, new OrderFulfillmentReceiveHandler());
        REPO.put(ApiEnum.ORDER_FULFILLMENT_FINISH, new OrderFulfillmentFinishHandler());

        REPO.put(ApiEnum.ORDER_AFTERSALE_CONFIRM, new OrderAftersaleConfirmHandler());
        REPO.put(ApiEnum.ORDER_AFTERSALE_CREATE, new OrderAftersaleCreateHandler());

        REPO.put(ApiEnum.ORDER_PAY_QUERY, new OrderPayQueryHandler());
        REPO.put(ApiEnum.RDER_RENTPLANINFO_APPEND, new OrderRentplaninfoAppendHandler());
        REPO.put(ApiEnum.ORDER_RISK_CONSULT, new OrderRiskConsultHandler());
        REPO.put(ApiEnum.ORDER_TRADE_QUERY, new OrderTradeQueryHandler());
        REPO.put(ApiEnum.ORDER_FUND_QUERY, new OrderFundQueryHandler());
        REPO.put(ApiEnum.ORDER_MODIFY, new OrderModifyHandler());
        REPO.put(ApiEnum.ORDER_TRADE_REFUND, new OrderTradeRefundHandler());
        REPO.put(ApiEnum.ORDER_TRADE_REFUND_QUERY, new OrderTradeRefundQueryHandler());
        REPO.put(ApiEnum.ORDER_BILL_QUERY, new OrderBillQueryHandler());

    }

    public static ApiHandler getHandler(BaseRequest request) {
        ApiEnum api = resolve(request);
        ApiHandler h = REPO.get(api);
        if (h == null) throw new IllegalStateException("未注册的API:" + api);
        return h;
    }

    private static ApiEnum resolve(BaseRequest request) {

        String name = request.getClass().getSimpleName();

        if (name.startsWith("UserLogin")) return ApiEnum.USER_LOGIN;
        if (name.startsWith("UserInfo")) return ApiEnum.USER_INFO;

        if (name.startsWith("OrderSign")) return ApiEnum.ORDER_SIGN;
        if (name.startsWith("OrderQuery")) return ApiEnum.ORDER_QUERY;
        if (name.startsWith("OrderCreate")) return ApiEnum.ORDER_CREATE;
        if (name.startsWith("OrderClose")) return ApiEnum.ORDER_CLOSE;

        if (name.startsWith("OrderPay")) return ApiEnum.ORDER_PAY;
        if (name.startsWith("OrderCancel")) return ApiEnum.ORDER_CANCEL;
        if (name.startsWith("OrderSync")) return ApiEnum.ORDER_SYNC;
        if (name.startsWith("OrderRefund")) return ApiEnum.ORDER_REFUND;

        if (name.startsWith("OrderFulfillmentApprove")) return ApiEnum.ORDER_FULFILLMENT_APPROVE;
        if (name.startsWith("OrderFulfillmentSend")) return ApiEnum.ORDER_FULFILLMENT_SEND;
        if (name.startsWith("OrderFulfillmentReceive")) return ApiEnum.ORDER_FULFILLMENT_RECEIVE;
        if (name.startsWith("OrderFulfillmentFinish")) return ApiEnum.ORDER_FULFILLMENT_FINISH;

        if (name.startsWith("OrderAftersaleConfirm")) return ApiEnum.ORDER_AFTERSALE_CONFIRM;
        if (name.startsWith("OrderAftersaleCreate")) return ApiEnum.ORDER_AFTERSALE_CREATE;

        if (name.startsWith("OrderPayQuery")) return ApiEnum.ORDER_PAY_QUERY;
        if (name.startsWith("OrderRentplaninfoAppend")) return ApiEnum.RDER_RENTPLANINFO_APPEND;
        if (name.startsWith("OrderRiskConsult")) return ApiEnum.ORDER_RISK_CONSULT;
        if (name.startsWith("OrderTradeQuery")) return ApiEnum.ORDER_TRADE_QUERY;
        if (name.startsWith("OrderFundQuery")) return ApiEnum.ORDER_FUND_QUERY;
        if (name.startsWith("OrderModify")) return ApiEnum.ORDER_MODIFY;
        if (name.startsWith("OrderTradeRefund")) return ApiEnum.ORDER_TRADE_REFUND;
        if (name.startsWith("OrderTradeRefundQuery")) return ApiEnum.ORDER_TRADE_REFUND_QUERY;
        if (name.startsWith("OrderBillQuery")) return ApiEnum.ORDER_BILL_QUERY;
        throw new IllegalArgumentException("无法识别的请求:" + name);
    }
}