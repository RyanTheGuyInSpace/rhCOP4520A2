package com.company;

import java.util.concurrent.Semaphore;

public class Showroom {
    private Semaphore semaphore = new Semaphore(1);

    public void enterShowroom(String guestName) throws InterruptedException {
        semaphore.acquire();
        System.out.println(guestName + " entered the showroom.");

        // The guest stays in the showroom for 2 seconds
        Thread.sleep(2000);
    }

    public void exitShowroom(String guestName) {
        System.out.println(guestName + " exited the showroom.");
        semaphore.release();
    }
}
