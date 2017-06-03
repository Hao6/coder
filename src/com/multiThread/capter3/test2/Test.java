package com.multiThread.capter3.test2;


/**
 * Created by hao on 17-6-2.
 */
public class Test {
    public static void main(String[] args) {
        try{
            Object object=new Object();
            MyThread1 myThread1=new MyThread1(object);
            myThread1.start();

            Thread.sleep(1000);

            MyThread2 myThread2=new MyThread2(object);
            myThread2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
