package com.multiThread.capter1.t15;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) {
            MyThread myThread=new MyThread();
            myThread.start();
            myThread.interrupt(); //并不能立即中断线程
            System.out.println("end");
    }
}
