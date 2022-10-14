package com.az.devops.devops.controller;

import java.util.Properties;

import com.az.devops.devops.utils.DevopsException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/systemInfo")
    public Properties getSystemInfo() {
       return System.getProperties();
    }

    @GetMapping("/testAdvice")
    public void testAdvice() {
        throw new DevopsException("Intentionally throwing error!");
    }

    @GetMapping("/testAdvice2")
    public void testAdvice2() {
        throw new HttpServerErrorException(HttpStatus.INTERNAL_SERVER_ERROR, "Intentionally throwing error!");
    }
    
}
