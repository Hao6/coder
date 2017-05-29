package com.multiThread.capter1.t8;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread{
    public void run(){
        try{
            System.out.println("run threadName "+
                    this.currentThread().getName()
            +" begin="+System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName "+
                    this.currentThread().getName()
                    +" end="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
