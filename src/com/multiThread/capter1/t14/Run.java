package com.multiThread.capter1.t14;

/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(200);
            myThread.interrupt(); //并不能立即中断线程

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
