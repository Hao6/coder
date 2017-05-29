package com.multiThread.capter1.t14;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("run begin");
            Thread.sleep(2000000);   //sleep状态可被中断
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在睡眠状态被中断！进入catch "+this.isInterrupted());
            e.printStackTrace();
        }
    }
}
