package com.epolsoft.rest_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.epolsoft.*")
public class RestApplication {

    public static void main(String[] args) {
            SpringApplication.run(RestApplication.class, args);
    }
}
