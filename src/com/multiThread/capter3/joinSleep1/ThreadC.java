package com.multiThread.capter3.joinSleep1;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadC extends Thread {
    private ThreadB b;

    public ThreadC(ThreadB b) {
        this.b = b;
    }

    public void run(){
        b.beService();
    }
}
