package com.company;

public class Guest implements Runnable {
    private String name;
    private Showroom showroom;

    public Guest(String name, Showroom showroom) {
        this.name = name;
        this.showroom = showroom;
    }

    @Override
    public void run() {
        try {
            // Enter and exit the showroom
            showroom.enterShowroom(name);
            showroom.exitShowroom(name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
