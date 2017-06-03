package com.multiThread.capter3.waitReleaseLock;

/**
 * Created by hao on 17-6-2.
 */
public class ThreadB implements Runnable {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }

}
