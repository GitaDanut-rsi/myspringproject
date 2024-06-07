package com.example.model;

public class Greeting {

    private String message;

    /**
     * Constructor for the Greeting class.
     *
     * @param message The greeting message.
     */
    public Greeting(String message) {
        this.message = message;
    }

    /**
     * Getter for the greeting message.
     *
     * @return The greeting message.
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter for the greeting message.
     *
     * @param message The new greeting message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
}