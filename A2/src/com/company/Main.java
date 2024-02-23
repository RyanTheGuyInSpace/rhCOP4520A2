package com.company;

public class Main {

    public static void main(String[] args) {
        int numberOfGuests = 5;

        Labyrinth labyrinth = new Labyrinth(numberOfGuests);

        for (int i = 0; i < numberOfGuests; i++) {
            Thread guestThread = new Thread(new Guest("Guest " + i, labyrinth));
            guestThread.start();
        }

        try {
            labyrinth.waitForAllGuests();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("The number of cupcakes taken is " + labyrinth.numCupcakesTaken);
        System.out.println("The number of guests is " + numberOfGuests);

        if (labyrinth.numCupcakesTaken >= numberOfGuests)
        {
            System.out.println("All guests have entered the labyrinth!");
        } else {
            System.out.println("Not all guests have entered the labyrinth...");
        }
    }
}
