package com.multiThread.capter1.t13;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread1 myThread=new MyThread1();
            myThread.start();
            Thread.sleep(1500);
            myThread.interrupt(); //并不能立即中断线程

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
