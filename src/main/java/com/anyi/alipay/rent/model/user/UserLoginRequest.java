package com.anyi.alipay.rent.model.user;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

@Data
public class UserLoginRequest implements BaseRequest {
    private String grantType = "authorization_code";
    private String code; // 小程序端获取的授权码

    public UserLoginRequest(String code) {
        this.code = code;
    }
}
