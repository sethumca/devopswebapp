package com.az.devops.devops.controller;

import java.util.Properties;

import com.az.devops.devops.utils.DevopsException;

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
        throw new DevopsException("This is for test!");
    }
    
}
