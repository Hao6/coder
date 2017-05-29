package com.multiThread.capter1.t13_1;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(1500);   //为什么是Thread.sleep(),而不是myThread.sleep()???
            myThread.interrupt(); //并不能立即中断线程

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
