package com.loveblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class LoveBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(LoveBlogApplication.class, args);
    }
} 