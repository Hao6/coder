package com.multiThread.capter1.t7;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        System.out.println("begin =="+myThread.isAlive());
        myThread.start();
        myThread.sleep(1000);
        System.out.println("end =="+myThread.isAlive());
    }
}
