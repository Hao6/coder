package com.multiThread.capter3.test2;

/**
 * Created by hao on 17-6-2.
 */
public class MyThread2 extends Thread {
    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            System.out.println("开始notify() " + System.currentTimeMillis());
            lock.notify();
            System.out.println("结束notify() " + System.currentTimeMillis());
        }
    }
}
