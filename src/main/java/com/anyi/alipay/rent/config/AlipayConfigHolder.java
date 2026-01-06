package com.anyi.alipay.rent.config;


public final class AlipayConfigHolder {

    private static String appId;
    private static String privateKey;
    private static String serverUrl;
    private static String charset = "UTF-8";
    private static String signType = "RSA2";
    private static String appCertPath;      // 应用证书路径
    private static String alipayPublicCertPath; // 支付宝公钥证书路径
    private static String rootCertPath;     // 根证书路径
    private static String aesEncryptKey;    // AES加密密钥

    public static void setAppId(String v) { appId = v; }
    public static void setPrivateKey(String v) { privateKey = v; }

    public static void setServerUrl(String v) { serverUrl = v; }
    public static void setCharset(String v) { charset = v; }
    public static void setSignType(String v) { signType = v; }
    public static void setAppCertPath(String v) { appCertPath = v; }
    public static void setAlipayPublicCertPath(String v) { alipayPublicCertPath = v; }
    public static void setRootCertPath(String v) { rootCertPath = v; }
    public static void setAesEncryptKey(String v) { aesEncryptKey = v; }

    public static String appId() { return appId; }
    public static String privateKey() { return privateKey; }

    public static String serverUrl() { return serverUrl; }
    public static String charset() { return charset; }
    public static String signType() { return signType; }
    public static String appCertPath() { return appCertPath; }
    public static String alipayPublicCertPath() { return alipayPublicCertPath; }
    public static String rootCertPath() { return rootCertPath; }
    public static String aesEncryptKey() { return aesEncryptKey; }

}