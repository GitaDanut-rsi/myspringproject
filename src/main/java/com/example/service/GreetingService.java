package com.example.service;

import com.example.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    /**
     * This method generates a greeting message.
     *
     * @param name The name to be included in the greeting message. If no name is provided, "World" is used as a default.
     * @return A Greeting object containing the greeting message.
     */
    public Greeting getGreeting(String name) {
        String message = "Hello, " + name + "!";
        return new Greeting(message);
    }
}