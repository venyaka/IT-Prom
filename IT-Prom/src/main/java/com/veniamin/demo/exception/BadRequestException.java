package com.veniamin.demo.exception;

import com.veniamin.demo.exception.errors.BadRequestError;
import lombok.Getter;

@Getter
public class BadRequestException extends BusinessException {

    private String errorName;

    public BadRequestException(BadRequestError badRequestError) {
        super(badRequestError.getMessage());
        errorName = badRequestError.name();
    }

    public BadRequestException(String message, String errorName) {
        super(message);
        this.errorName = errorName;
    }
}
