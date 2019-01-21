package com.oyvindsorlie;

public class MyThread implements Runnable {

    Thread thread;    // Instance variable to use in the constructor, so that we can spawn as many threads as wanted in the main-method
    String myTread;   // Or rather, myString

    @Override
    public void run() {
        System.out.println(myTread + " starting!");

        for (int count = 0; count < 10; count++){
            try {
                Thread.sleep(800);
                System.out.println("In " + myTread + " count is " + count);
            }
            catch (InterruptedException e) {
                System.out.println(myTread + " interrupted.");
                e.printStackTrace();
            }
            System.out.println(myTread + " terminated.");
        }
    }

    // Class constructor
    public MyThread(String myTread) {
        this.myTread = myTread;
        thread = new Thread(this, myTread);
        thread.start();

    }
}
