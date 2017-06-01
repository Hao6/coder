package com.multiThread.capter2.synStaticMethod;

/**
 * Created by hao on 17-6-1.
 */
public class Service {
    public synchronized static void printA() {
        try {
            System.out.println("the thread name: " + Thread.currentThread().getName()
                    + " in " + System.currentTimeMillis() + " printA()");
            Thread.sleep(3000);
            System.out.println("the thread name: " + Thread.currentThread().getName()
                    + " out " + System.currentTimeMillis() + " printA()");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public synchronized static void printB() {

        System.out.println("the thread name: " + Thread.currentThread().getName()
                + " in " + System.currentTimeMillis() + " printB()");
        System.out.println("the thread name: " + Thread.currentThread().getName()
                + " out " + System.currentTimeMillis() + " printB()");


    }
}
