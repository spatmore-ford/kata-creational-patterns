package com.ford.creational;

public class Emperor {

    private final EmperorsSeal seal;

    public Emperor(EmperorsSeal seal) {
        this.seal = seal;
    }

    public String getName() {
        return seal.name();
    }

    public void sendEmissary(RoyalEmissary royalEmissary) throws InterruptedException {
        // it takes time to travel between kingdoms
        Thread.sleep(200);

        String message = royalEmissary.deliverMessage(seal);
        System.out.println(message);
    }
}
