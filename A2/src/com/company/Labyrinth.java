package com.company;

import java.util.concurrent.Semaphore;

public class Labyrinth {
    private final Semaphore entranceSemaphore;
    private final Semaphore exitSemaphore;
    int numCupcakesTaken = 0;

    public Labyrinth(int capacity) {
        entranceSemaphore = new Semaphore(capacity, true);
        exitSemaphore = new Semaphore(0, true);
    }

    public void enterLabyrinth(String name) throws InterruptedException {
        entranceSemaphore.acquire();
        System.out.println("Guest " + name + " entered the labyrinth.");
    }

    public void exitLabyrinth(String name) throws InterruptedException {
        System.out.println("Guest " + name + " exited the labyrinth and found a cupcake.");

        // Increase cupcake count to notify Minotaur that a guest has exited
        numCupcakesTaken += 1;

        exitSemaphore.release();
    }

    public void waitForAllGuests() throws InterruptedException {
        // Wait for all guests to exit the labyrinth
        exitSemaphore.acquire(5);
        System.out.println("All guests have visited the labyrinth.");
    }
}
