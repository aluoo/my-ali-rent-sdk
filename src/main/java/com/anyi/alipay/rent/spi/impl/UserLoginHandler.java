package com.anyi.alipay.rent.spi.impl;


import com.alipay.api.request.AlipaySystemOauthTokenRequest;
import com.alipay.api.response.AlipaySystemOauthTokenResponse;
import com.anyi.alipay.rent.model.user.UserLoginRequest;
import com.anyi.alipay.rent.model.user.UserLoginResponse;
import com.anyi.alipay.rent.spi.ApiHandler;
import com.anyi.alipay.rent.model.common.Result;
import com.alipay.api.AlipayClient;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.model.common.BaseResponse;

public class UserLoginHandler implements ApiHandler {

    @Override
    public <T extends BaseResponse> Result<T> execute(AlipayClient client,
                                                      BaseRequest request,
                                                      Class<T> respClazz) {
        try {
            UserLoginRequest loginRequest = (UserLoginRequest) request;
            AlipaySystemOauthTokenRequest alipayRequest = new AlipaySystemOauthTokenRequest();
            alipayRequest.setCode(loginRequest.getCode());
            alipayRequest.setGrantType(loginRequest.getGrantType());

            AlipaySystemOauthTokenResponse alipayResponse = client.execute(alipayRequest);

            if (!alipayResponse.isSuccess()) {
                return Result.fail(Integer.parseInt(alipayResponse.getCode()),
                        alipayResponse.getMsg() + ":" + alipayResponse.getSubMsg());
            }

            UserLoginResponse userLoginResponse = new UserLoginResponse();
            userLoginResponse.setUserId(alipayResponse.getUserId());
            userLoginResponse.setOpenId(alipayResponse.getOpenId());
            userLoginResponse.setAccessToken(alipayResponse.getAccessToken());
            userLoginResponse.setRefreshToken(alipayResponse.getRefreshToken());
            userLoginResponse.setExpiresIn(alipayResponse.getExpiresIn());

            return Result.ok((T) userLoginResponse);
        } catch (Exception e) {
            throw new RuntimeException("支付宝登录异常", e);
        }
    }
}
