package com.ford.creational;

public class SecretMessage {

    private final String message;
    private final Cypher cypher;

    public SecretMessage(String message) throws InterruptedException {
        cypher = new Cypher();
        this.message = cypher.encrypt(message);
    }

    public String getMessage() throws InterruptedException {
        return cypher.decrypt(message);
    }

    private class Cypher {

        public Cypher() throws InterruptedException {
            // It takes time to prepare a new cypher
            Thread.sleep(4000);
        }

        private String encrypt(String text) throws InterruptedException {
            // It takes time to encrypt a message
            Thread.sleep(500);
            return text;
        }

        private String decrypt(String text) throws InterruptedException {
            // It takes time to decrypt a message
            Thread.sleep(500);
            return text;
        }
    }
}
