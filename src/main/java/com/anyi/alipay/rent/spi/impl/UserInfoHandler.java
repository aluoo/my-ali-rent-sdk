package com.anyi.alipay.rent.spi.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayUserInfoShareRequest;
import com.alipay.api.response.AlipayUserInfoShareResponse;
import com.anyi.alipay.rent.model.common.BaseRequest;
import com.anyi.alipay.rent.model.common.BaseResponse;
import com.anyi.alipay.rent.model.common.Result;
import com.anyi.alipay.rent.model.user.UserInfoRequest;
import com.anyi.alipay.rent.model.user.UserInfoResponse;
import com.anyi.alipay.rent.spi.ApiHandler;

public class UserInfoHandler implements ApiHandler {

    @Override
    public <T extends BaseResponse> Result<T> execute(AlipayClient client,
                                                      BaseRequest request,
                                                      Class<T> respClazz) {
        try {
            UserInfoRequest userInfoRequest = (UserInfoRequest) request;
            AlipayUserInfoShareRequest alipayRequest = new AlipayUserInfoShareRequest();

            // setAppAuthToken 不存在
            alipayRequest.putOtherTextParam("app_auth_token", userInfoRequest.getAuthToken());

            AlipayUserInfoShareResponse alipayResponse = client.execute(alipayRequest);

            if (!alipayResponse.isSuccess()) {
                return Result.fail(Integer.parseInt(alipayResponse.getCode()),
                        alipayResponse.getMsg() + ":" + alipayResponse.getSubMsg());
            }

            UserInfoResponse userInfoResponse = new UserInfoResponse();
            userInfoResponse.setCode(alipayResponse.getCode());
            userInfoResponse.setMsg(alipayResponse.getMsg());
            userInfoResponse.setUserId(alipayResponse.getUserId());
            userInfoResponse.setOpenId(alipayResponse.getOpenId());
            userInfoResponse.setNickName(alipayResponse.getNickName());
            userInfoResponse.setAvatar(alipayResponse.getAvatar());
            userInfoResponse.setGender(alipayResponse.getGender());
            userInfoResponse.setCity(alipayResponse.getCity());
            userInfoResponse.setProvince(alipayResponse.getProvince());
            userInfoResponse.setCountryCode(alipayResponse.getCountryCode());

            return Result.ok((T) userInfoResponse);
        } catch (Exception e) {
            throw new RuntimeException("获取用户信息异常", e);
        }
    }
}
