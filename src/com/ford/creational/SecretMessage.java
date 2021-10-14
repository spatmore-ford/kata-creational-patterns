package com.ford.creational;

public class SecretMessage {

    private final String message;

    public SecretMessage(String message) throws InterruptedException {
        this.message = message;

        // It takes time to encrypted a message, and setup a booby trap
        Thread.sleep(2000);
    }

    public String getMessage() {
        return message;
    }
}
