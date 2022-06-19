package com.upgrad.mfaproject.Exception;

public class EmployeeNotFound extends RuntimeException {
    private int statusCode;

    public EmployeeNotFound(String message, int statusCode) {
        super(message);
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
