package com.veniamin.demo.exception.errors;

public enum BadRequestError {

    EMPLOYEE_ALREADY_EXISTS("Пользователь с такой почтой уже существует"),
    EMPLOYEE_IS_NOT_EXISTS("Пользователь не существует");

    private String message;

    BadRequestError(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}


