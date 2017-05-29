package com.multiThread.capter1.t12;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();  //为什么这样可以中断，而直接使用线程对象不可以？？？
//        MyThread myThread=new MyThread();
//        myThread.interrupt();
        System.out.println("是否停止1？ ="+Thread.interrupted());
        System.out.println("是否停止2？ ="+Thread.interrupted());
        System.out.println("end!!!");
    }
}
