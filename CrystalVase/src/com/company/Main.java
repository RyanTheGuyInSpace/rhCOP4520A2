package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfGuests = 5;

        Showroom showroom = new Showroom();

        for (int i = 1; i <= numberOfGuests; i++) {
            Thread guestThread = new Thread(new Guest("Guest " + i, showroom));
            guestThread.start();
        }
    }
}
