package com.multiThread.capter3.joinException;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run(){
        threadB.interrupt();
    }
}
