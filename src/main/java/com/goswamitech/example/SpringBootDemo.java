package com.goswamitech.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class SpringBootDemo {

    public static void main(String[] args){
        SpringApplication.run(SpringBootDemo.class, args);
    }
}
