package com.example.controller;

import com.example.model.Greeting;
import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    /**
     * This method handles GET requests sent to the /greeting endpoint.
     * It uses the GreetingService to generate a greeting message.
     *
     * @param name The name to be included in the greeting message. If no name is provided, "World" is used as a default.
     * @return A Greeting object containing the greeting message.
     */
    @GetMapping("/greeting")
    public Greeting greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greetingService.getGreeting(name);
    }
}