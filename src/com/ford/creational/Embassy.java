package com.ford.creational;

import java.util.ArrayList;

public class Embassy {

    private static final Iterable<Emperor> emperors = new ArrayList<>() {{
        add(Emperors.empressJi);
        add(Emperors.emperorKwang);
        add(Emperors.emperorJiang);
    }};

    private final RoyalEmissary royalEmissary = new RoyalEmissary();

    public void sendMessageTo(String recipient, String message) {
        try {
            String formattedMessage = formatMessage(recipient, message);
            SecretMessage secretMessage = new SecretMessage(formattedMessage);
            royalEmissary.giveMessage(recipient, secretMessage);

            for (Emperor emperor : emperors) {
                if (emperor.getName().equals(recipient)) {
                    emperor.sendEmissary(royalEmissary);
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public String formatMessage(String recipient, String message) {
        return recipient + "; it is important that you know: " + message;
    }
}
