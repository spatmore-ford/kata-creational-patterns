package com.ford.creational;

public class RoyalEmissary {

    private SecretMessage message = null;
    private String recipient = null;

    public RoyalEmissary() {
    }

    public void giveMessage(String recipient, SecretMessage message) {
        this.message = message;
        this.recipient = recipient;
    }

    public String deliverMessage(EmperorsSeal seal) {
        if (seal.name().equals(recipient)) {
            String message = this.message.getMessage();
            System.out.println("Message delivered");
            return message;
        } else {
            System.out.println("You're not " + recipient + "...");
            throw new SelfDestructException();
        }
    }

    private static class SelfDestructException extends RuntimeException {

        public SelfDestructException() {
            super("Boom!");
        }
    }

}
