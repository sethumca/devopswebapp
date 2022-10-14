package com.az.devops.devops.controller;

import com.az.devops.devops.utils.DevopsException;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(DevopsException.class)
    @ResponseBody
    public String handleRuntimeException(Exception ex) {
        return ex.getMessage();
    }
    
}
