package com.company;

public class Guest implements Runnable {
    private String name;
    private final Labyrinth labyrinth;

    public Guest(String guestName, Labyrinth labyrinth) {
        this.name = guestName;
        this.labyrinth = labyrinth;
    }

    @Override
    public void run() {
        try {
            // Guests enter the labyrinth
            labyrinth.enterLabyrinth(name);

            // Simulate some activity inside the labyrinth
            Thread.sleep(1000);

            // Guests exit the labyrinth
            labyrinth.exitLabyrinth(name);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}