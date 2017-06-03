package com.multiThread.capter3.waitInterruptException;


/**
 * Created by hao on 17-6-2.
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
