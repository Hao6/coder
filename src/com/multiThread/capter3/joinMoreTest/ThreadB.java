package com.multiThread.capter3.joinMoreTest;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadB extends Thread {
    @Override
    public synchronized void run() {
        try {

            System.out.println("begin B " + System.currentTimeMillis() +
                    " " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end B " + System.currentTimeMillis() +
                    " " + Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
