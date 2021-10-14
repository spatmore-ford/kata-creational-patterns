package com.ford.creational;

public class Emperors {

    private Emperors() {
    }

    public static final Emperor empressJi = new Emperor(() -> "Empress Ji");
    public static final Emperor emperorKwang = new Emperor(() -> "Emperor Kwang");
    public static final Emperor emperorJiang = new Emperor(() -> "Emperor Jiang");

}
