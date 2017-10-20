package com.wei.mao.exception;

public class FastException extends RuntimeException {

    public FastException() {
        super();
    }

    public FastException(String message) {
        super(message);
    }

    public FastException(String message, Throwable cause) {
        super(message, cause);
    }

    public FastException(Throwable cause) {
        super(cause);
    }

    protected FastException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public Throwable fillInStackTrace() {
        return null;
    }
}
