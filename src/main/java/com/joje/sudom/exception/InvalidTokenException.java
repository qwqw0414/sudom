package com.joje.sudom.exception;

public class InvalidTokenException extends RuntimeException {
    public InvalidTokenException() {}
    public InvalidTokenException(String message) {
        super(message);
    }
    public InvalidTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}
