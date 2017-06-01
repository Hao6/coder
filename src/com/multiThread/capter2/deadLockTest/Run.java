package com.multiThread.capter2.deadLockTest;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        try {
            DealThread dealThread = new DealThread();
            dealThread.setFlag("a");
            Thread thread1 = new Thread(dealThread);
            thread1.start();

            Thread.sleep(100);
            dealThread.setFlag("b");
            Thread thread2 = new Thread(dealThread);
            thread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
