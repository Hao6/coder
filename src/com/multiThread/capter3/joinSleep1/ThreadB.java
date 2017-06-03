package com.multiThread.capter3.joinSleep1;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadB extends Thread {

    @Override
    public void run(){
        try{
            System.out.println(" b run begin timer="+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println(" b run end timer="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void beService(){
        System.out.println("打印了beService timer="+System.currentTimeMillis());
    }
}
