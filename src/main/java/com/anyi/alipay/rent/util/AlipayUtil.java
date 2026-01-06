package com.anyi.alipay.rent.util;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipayEncrypt;
import com.alipay.api.internal.util.AlipaySignature;
import com.anyi.alipay.rent.config.AlipayConfigHolder;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class AlipayUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /** 验签 */
    public static boolean verify(Map<String,String> params) throws AlipayApiException {
        return AlipaySignature.rsaCertCheckV1(params,
                AlipayConfigHolder.alipayPublicCertPath(),
                AlipayConfigHolder.charset(),
                AlipayConfigHolder.signType());
    }


    /**
     * 解密支付宝小程序返回的手机号加密数据
     * @param encryptedData 加密数据
     * @return 解密后的手机号
     * @throws Exception 解密异常
     */
    public static String decryptPhone(String encryptedData) throws Exception {
        try {

            String aesEncryptKey = AlipayConfigHolder.aesEncryptKey();
            String charset = AlipayConfigHolder.charset();

            String decryptContent = AlipayEncrypt.decryptContent(
                    encryptedData,
                    "AES",
                    aesEncryptKey,
                    charset
            );

            JsonNode jsonNode = objectMapper.readTree(decryptContent);
            JsonNode phoneNumberNode = jsonNode.get("phoneNumber");
            return phoneNumberNode != null ? phoneNumberNode.asText() : decryptContent;

        } catch (Exception e) {
            throw new RuntimeException("手机号解密失败", e);
        }
    }
}
