package com.multiThread.capter1.suspendResumeTest;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    private long i=0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }
    @Override
    public void run(){
        while(true){
            i++;
        }
    }
}
