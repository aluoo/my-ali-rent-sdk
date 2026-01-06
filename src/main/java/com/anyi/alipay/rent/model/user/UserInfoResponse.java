package com.anyi.alipay.rent.model.user;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class UserInfoResponse implements BaseResponse {
    private String code;
    private String msg;

    private String userId;
    private String openId;
    private String nickName;
    private String avatar;
    private String gender;
    private String city;
    private String province;
    private String countryCode;
    private String phone;
}
