package com.az.devops.devops.controller;

import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/systemInfo")
    public Properties getSystemInfo() {
       return System.getProperties();
    }

    @GetMapping("/testAdvice")
    public void testAdvice() {
        throw new RuntimeException("This is for test!");
    }
    
}
