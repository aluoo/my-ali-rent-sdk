package com.anyi.alipay.rent.model.user;

import com.anyi.alipay.rent.model.common.BaseRequest;
import lombok.Data;

@Data
public class UserInfoRequest implements BaseRequest {
    private String authToken;
}
