package com.cyan.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.GATEWAY_TIMEOUT,reason = "访问超时")
public class ResponseStatusException extends RuntimeException{

    public ResponseStatusException(){}

    public ResponseStatusException(String message) {
        super(message);
    }
}
