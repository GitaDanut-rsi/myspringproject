package com.example.service;

import com.example.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public Greeting getGreeting(String name) {
        String message = "Hello, " + name + "!";
        return new Greeting(message);
    }
}