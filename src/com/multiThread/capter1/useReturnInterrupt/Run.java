package com.multiThread.capter1.useReturnInterrupt;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        Thread.sleep(2000);
        myThread.interrupt();
    }
}
