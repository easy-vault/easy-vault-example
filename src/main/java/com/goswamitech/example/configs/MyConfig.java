package com.goswamitech.example.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class MyConfig {
    @Value("${say}")
    private  String say;

    @Value("${username}")
    private  String username;

    @Value("${password}")
    private String password;

    @Value("${app.name}")
    private String appName;

    @PostConstruct
    public void fun(){
        System.out.println(say);
        System.out.println(username);
        System.out.println(password);
        System.out.println(appName);
    }
}
