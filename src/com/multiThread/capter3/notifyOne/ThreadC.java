package com.multiThread.capter3.notifyOne;

/**
 * Created by hao on 17-6-2.
 */
public class ThreadC extends Thread {
    private Object lock;

    public ThreadC(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }
}
