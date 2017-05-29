package com.multiThread.capter1.suspendResumeTest;


/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        Thread.sleep(5000);

        myThread.suspend();
        System.out.println("A= "+System.currentTimeMillis()+" i="+myThread.getI());
        Thread.sleep(5000);
        System.out.println("A= "+System.currentTimeMillis()+" i="+myThread.getI());

        myThread.resume();

        Thread.sleep(5000);

        myThread.suspend();
        System.out.println("B= "+System.currentTimeMillis()+" i="+myThread.getI());
        Thread.sleep(5000);
        System.out.println("B= "+System.currentTimeMillis()+" i="+myThread.getI());

    }
}
