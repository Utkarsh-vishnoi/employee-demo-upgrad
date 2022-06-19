package com.upgrad.mfaproject.Data.DTO;

public class ExceptionDTO {
    private String message;

    private int statusCode ;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "ExceptionDTO{" +
                "message='" + message + '\'' +
                ", statusCode=" + statusCode +
                '}';
    }
}
