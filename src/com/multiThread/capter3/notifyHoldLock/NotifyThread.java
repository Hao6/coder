package com.multiThread.capter3.notifyHoldLock;

/**
 * Created by hao on 17-6-2.
 */
public class NotifyThread implements Runnable {
    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.synNotifyMethod(lock);
    }
}
