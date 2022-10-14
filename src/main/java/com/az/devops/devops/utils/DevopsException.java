package com.az.devops.devops.utils;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class DevopsException extends RuntimeException {

    public DevopsException(String msg) {
        super(msg);
    }
    
}
