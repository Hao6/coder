package com.multiThread.capter1.useReturnInterrupt;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        while(true){
            if(this.isInterrupted()){
                System.out.println("中断发生");
                return;   //使用return终止线程中断后的动作
            }
            System.out.println("current time:"+System.currentTimeMillis());
        }
    }
}
