package com.multiThread.t8;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        System.out.println("begin ="+System.currentTimeMillis());
        myThread.start();
        System.out.println("end ="+System.currentTimeMillis());
    }
}
