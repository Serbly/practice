package com.example.practice.exception;

import java.text.MessageFormat;

public class RefreshTokenException extends RuntimeException {
    public RefreshTokenException(String token, String message) {
        super(MessageFormat.format("Error trying to by token: {0} : {1}", token, message));
    }

    public RefreshTokenException(String message) {
        super(message);
    }
}
