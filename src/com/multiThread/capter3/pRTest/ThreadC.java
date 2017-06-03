package com.multiThread.capter3.pRTest;

/**
 * Created by hao on 17-6-2.
 */
public class ThreadC extends Thread{
    private C c;

    public ThreadC(C c) {
        this.c = c;
    }

    public void run(){
        while (true){
            c.getValue();
        }
    }
}
