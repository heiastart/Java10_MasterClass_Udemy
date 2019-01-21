package com.oyvindsorlie;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread starting :) ");

        // Construct MyThread object
        MyThread myThread = new MyThread("Child #1");
        MyThread myThread2 = new MyThread("Child #2");
        MyThread myThread3 = new MyThread("Child #3");

        try {
            // How to use/set priority to threads
            myThread.thread.setPriority(Thread.MIN_PRIORITY);
            System.out.println("Child 1 priority is " + myThread.thread.getPriority());
            myThread2.thread.setPriority(Thread.NORM_PRIORITY);
            System.out.println("Child 2 priority is " + myThread2.thread.getPriority());
            myThread3.thread.setPriority(Thread.MAX_PRIORITY);
            System.out.println("Child 3 priority is " + myThread3.thread.getPriority());

            // join method -> wait until specified thread ends
//            myThread.thread.join();
//            System.out.println("Child #1 joined");
//            myThread2.thread.join();
//            System.out.println("Child #2 joined");
//            myThread3.thread.join();
//            System.out.println("Child #3 joined");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // One way to do it;
        /*
        do {
            System.out.println(".");

            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.print("Main thread interrupted");
                e.printStackTrace();
            }
        }
        while(myThread.thread.isAlive() || myThread2.thread.isAlive() || myThread3.thread.isAlive());

        System.out.print("Main thread ending");
         */

        // Another way to do the same;
        /*
        for (int i = 0; i < 50; i++){
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.print("Main thread interrupted");
                e.printStackTrace();
            }
        }
        System.out.print("Main thread ending");
         */

        //myThread.run();

        // Construct an actual thread from the previous object...or run the myThread.run() - this part applies ONLY to when we did NOT have thread = new Thread(this, myTread); in the constructor
        //Thread newThread = new Thread(myThread);
        //newThread.start();


    }
}
