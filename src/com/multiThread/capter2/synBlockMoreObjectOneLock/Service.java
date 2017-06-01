package com.multiThread.capter2.synBlockMoreObjectOneLock;

/**
 * Created by hao on 17-6-1.
 */
public class Service {
    public static void printA() {
        synchronized (Service.class) {
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

    }

    public synchronized static void printB() {
        synchronized (Service.class) {

            System.out.println("the thread name: " + Thread.currentThread().getName()
                    + " in " + System.currentTimeMillis() + " printB()");
            System.out.println("the thread name: " + Thread.currentThread().getName()
                    + " out " + System.currentTimeMillis() + " printB()");
        }


    }
}
