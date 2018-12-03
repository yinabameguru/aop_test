package com.jza.aop_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = {"classpath:spring-aop.xml"})
public class AopTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(AopTestApplication.class, args);
    }
}
