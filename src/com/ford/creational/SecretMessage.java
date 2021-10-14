package com.ford.creational;

public class SecretMessage {

    private final String message;

    public SecretMessage(String message) throws InterruptedException {
        this.message = new Cypher().encrypt(message);
    }

    public String getMessage() {
        return message;
    }

    private class Cypher {

        private String encrypt(String text) throws InterruptedException {
            // It takes a long time to encrypt a message
            Thread.sleep(5000);
            return text;
        }
    }
}
