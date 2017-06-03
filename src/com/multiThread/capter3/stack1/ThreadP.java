package com.multiThread.capter3.stack1;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadP extends Thread {
    private P p;

    public ThreadP(P p) {
        this.p = p;
    }

    public void run(){
        while(true) {
            p.pushService();
        }
    }
}
