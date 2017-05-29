package com.multiThread.capter2.synchronizedMethodLockObject2;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyObject {
    public  synchronized void methodA(){
        try {
            System.out.println("begin methodA thread name:" + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end endTime:" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public synchronized void methodB(){
        try {
            System.out.println("begin methodB thread name:" + Thread.currentThread().getName());
            Thread.sleep(1000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
