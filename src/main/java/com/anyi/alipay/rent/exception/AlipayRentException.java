package com.anyi.alipay.rent.exception;

import lombok.Getter;

public class AlipayRentException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    @Getter
    private final int code;

    public AlipayRentException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public AlipayRentException(int code, String msg, Throwable cause) {
        super(msg, cause);
        this.code = code;
    }
}