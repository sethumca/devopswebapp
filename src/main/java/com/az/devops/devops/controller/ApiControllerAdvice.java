package com.az.devops.devops.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public String handleRuntimeException(Exception ex) {
        return ex.getMessage();
    }
    
}
