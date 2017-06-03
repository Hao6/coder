package com.multiThread.capter3.joinLong;

/**
 * Created by hao on 17-6-3.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        try{
            System.out.println("begin time="+System.currentTimeMillis());
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
