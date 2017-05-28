package com.multiThread.capter1.t11;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        for(int i=0;i<5000;i++){
            System.out.println("i="+(i+1));
        }
    }
}
