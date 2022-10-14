package com.az.devops.devops.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpServerErrorException;

@RestControllerAdvice
public class ApiControllerAdvice {

    @ExceptionHandler(HttpServerErrorException.class)
    public ResponseEntity<String> handleRuntimeException(Exception ex) {
        return ResponseEntity.internalServerError().body(ex.getMessage());
    }
    
}
