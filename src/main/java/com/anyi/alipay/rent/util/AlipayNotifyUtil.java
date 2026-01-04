package com.anyi.alipay.rent.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.anyi.alipay.rent.config.AlipayConfigHolder;

import java.util.Map;

public final class AlipayNotifyUtil {

    /** 验签 */
    public static boolean verify(Map<String,String> params) throws AlipayApiException {
        return AlipaySignature.rsaCheckV1(params,
                AlipayConfigHolder.alipayPublicKey(),
                "UTF-8","RSA2");
    }


    private AlipayNotifyUtil(){}
}
