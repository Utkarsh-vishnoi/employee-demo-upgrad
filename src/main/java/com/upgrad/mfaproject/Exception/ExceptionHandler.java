package com.upgrad.mfaproject.Exception;

import com.upgrad.mfaproject.Data.DTO.ExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(EmployeeNotFound.class)
    public final ResponseEntity<ExceptionDTO> handleEmployeeNotFound(EmployeeNotFound e, WebRequest req) {
        ExceptionDTO exceptionDTO = new ExceptionDTO();

        exceptionDTO.setMessage(e.getMessage());
        exceptionDTO.setStatusCode(e.getStatusCode());

        return new ResponseEntity<ExceptionDTO>(exceptionDTO, HttpStatus.BAD_REQUEST);
    }
}
