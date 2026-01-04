package com.anyi.alipay.rent.model.order;

import com.anyi.alipay.rent.model.common.BaseResponse;
import lombok.Data;

@Data
public class OrderSignResponse implements BaseResponse {
    private String code;
    private String msg;
    /** 签约启动串 */
    private String signStr;
    /** 签约方式，使用插件拉起受理台进行签约 签约受理台: RECEPTION 预授权支付: TRADEPAY */
    private String signLaunchMethod;
}