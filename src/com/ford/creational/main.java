package com.ford.creational;

public class main {

    public static void main(String[] args) {

        timed(main::sendMessages);
    }

    private static void sendMessages() {
        Embassy embassy = new Embassy();

        embassy.sendMessageTo(Emperors.empressJi.getName(), "I am a Fish");
    }

    private static void timed(Runnable runnable) {
        long startTime = System.currentTimeMillis();

        runnable.run();

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Duration: " + duration + "ms");
    }
}

