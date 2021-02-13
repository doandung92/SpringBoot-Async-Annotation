package com.example.async.controller;

import com.example.async.service.*;
import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class MainController {
    private final DemoService demoService;

    @GetMapping("/hello")
    public String hello() {
        System.out.println(Thread.currentThread().getName());
        long start = System.currentTimeMillis();
        demoService.processSomethingForLong();
        long end = System.currentTimeMillis();
        return "Hello World Took " + (end - start) +
                " milliseconds ! and the current Thread is : "
                +Thread.currentThread().getName();
    }

    @GetMapping("/hi")
    public String hi() {
        return "Hi"
                +Thread.currentThread().getName();
    }
}
