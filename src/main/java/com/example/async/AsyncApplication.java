package com.example.async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.*;

import java.util.concurrent.*;

@EnableAsync
@SpringBootApplication
public class AsyncApplication {

    @Bean
    Executor executor() {
        return Executors.newFixedThreadPool(100);
    }

    public static void main(String[] args) {
        SpringApplication.run(AsyncApplication.class, args);
    }

}
