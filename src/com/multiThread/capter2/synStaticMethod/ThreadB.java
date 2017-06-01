package com.multiThread.capter2.synStaticMethod;

/**
 * Created by hao on 17-6-1.
 */
public class ThreadB extends Thread{
    @Override
    public void run(){
        Service.printB();
    }
}
