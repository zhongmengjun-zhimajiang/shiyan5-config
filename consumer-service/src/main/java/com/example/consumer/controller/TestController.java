package com.example.consumer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestController {

    @Value("${test.consumer.message:Hello from Consumer Service!}")
    private String message;

    @GetMapping("/test")
    public String test() {
        return message;
    }
} 