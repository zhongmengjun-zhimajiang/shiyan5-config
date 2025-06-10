package com.example.configserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // 禁用CSRF，因为actuator/bus-refresh是POST请求
            .authorizeHttpRequests(authorize -> authorize
                .anyRequest().permitAll() // 允许所有请求，用于测试
            );
        return http.build();
    }
} 