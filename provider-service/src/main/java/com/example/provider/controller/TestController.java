package com.example.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {
    
    @Value("${test.message:Hello World}")
    private String message;
    
    @GetMapping("/test")
    public String test() {
        return message;
    }
} 