package com.anyi.alipay.rent.model.user;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class UserLoginResponse implements BaseResponse {
    private String userId;
    private String openId;
    private String accessToken;
    private String refreshToken;
    private String expiresIn;
}
