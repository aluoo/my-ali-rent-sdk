package com.anyi.alipay.rent.client;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.anyi.alipay.rent.config.AlipayConfigHolder;
import com.anyi.alipay.rent.exception.AlipayRentException;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.model.common.BaseResponse;
import com.anyi.alipay.rent.model.common.Result;
import com.anyi.alipay.rent.spi.ApiHandler;
import com.anyi.alipay.rent.spi.HandlerFactory;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class AlipayRentClient {

    private final AlipayClient alipayClient;
    private final Executor executor;   // 可为 null，表示同步

    private AlipayRentClient(AlipayClient alipayClient, Executor executor) {
        this.alipayClient = alipayClient;
        this.executor = executor;
    }

    /* 同步入口 */
    public <T extends BaseResponse> Result<T> invoke(BaseRequest request, Class<T> respClazz) {
        return HandlerFactory.getHandler(request)
                .execute(alipayClient, request, respClazz);
    }

    /* 异步入口 */
    public <T extends BaseResponse> CompletableFuture<Result<T>> invokeAsync(BaseRequest request,
                                                                             Class<T> respClazz,
                                                                             Executor executor) {
        return CompletableFuture.supplyAsync(() -> invoke(request, respClazz), executor);
    }

    /* 快速 Builder，隐藏 AlipayClient 创建细节 */
    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Executor executor;
        public Builder executor(Executor executor) {
            this.executor = executor;
            return this;
        }
        public AlipayRentClient build() {
            AlipayClient client = new DefaultAlipayClient(
                    AlipayConfigHolder.serverUrl(),
                    AlipayConfigHolder.appId(),
                    AlipayConfigHolder.privateKey(),
                    "json",
                    AlipayConfigHolder.charset(),
                    AlipayConfigHolder.alipayPublicKey(),
                    AlipayConfigHolder.signType());
            return new AlipayRentClient(client, executor);
        }
    }
}