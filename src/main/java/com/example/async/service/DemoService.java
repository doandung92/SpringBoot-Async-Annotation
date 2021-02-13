package com.example.async.service;

import org.springframework.scheduling.annotation.*;
import org.springframework.stereotype.*;

@Service
public class DemoService {

    @Async
    public void processSomethingForLong() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I take 10 seconds to complete on a Thread named : "
                + Thread.currentThread().getName());
    }
}
