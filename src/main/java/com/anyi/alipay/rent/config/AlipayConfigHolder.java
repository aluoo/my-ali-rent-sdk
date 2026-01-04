package com.anyi.alipay.rent.config;

import cn.hutool.core.util.StrUtil;


public final class AlipayConfigHolder {

    private static String appId;
    private static String privateKey;
    private static String alipayPublicKey;
    private static String serverUrl;
    private static String charset;
    private static String signType;


    public static void setAppId(String v)             { appId = v; }
    public static void setPrivateKey(String v)        { privateKey = v; }
    public static void setAlipayPublicKey(String v)   { alipayPublicKey = v; }
    public static void setServerUrl(String v)         { serverUrl = v; }
    public static void setCharset(String v)           { charset = v; }
    public static void setSignType(String v)          { signType = v; }


    public static String appId()             { return appId; }
    public static String privateKey()        { return privateKey; }
    public static String alipayPublicKey()   { return alipayPublicKey; }
    public static String serverUrl()         { return serverUrl; }
    public static String charset()           { return charset; }
    public static String signType()          { return signType; }

    public static boolean ready() {
        return StrUtil.isAllNotBlank(appId, privateKey, alipayPublicKey);
    }
}