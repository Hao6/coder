package com.multiThread.capter1.t13;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        for(int i=0;i<500000;i++){
            if(this.isInterrupted()){
                System.out.println("the current thread was interrupted!");
                break;
            }
            System.out.println("i="+(i+1));
        }
    }
}
