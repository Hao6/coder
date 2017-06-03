package com.multiThread.capter3.notifyOne;

/**
 * Created by hao on 17-6-2.
 */
public class NotifyThread implements Runnable {

    private Object lock;
    public NotifyThread(Object lock){
        this.lock=lock;
    }
    @Override
    public void run() {
        synchronized (lock) {
//            lock.notify();   //一次只能随即唤醒一个处于wait()的线程，不能指望唤醒多个
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();
            lock.notifyAll();


        }
    }
}
