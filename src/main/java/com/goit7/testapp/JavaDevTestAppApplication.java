package com.goit7.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class JavaDevTestAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDevTestAppApplication.class, args);

    }
}
