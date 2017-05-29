package com.multiThread.capter2.synBlockString;

/**
 * Created by hongji on 2017/5/29.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        super();
        this.service=service;
    }
    @Override
    public void run(){
        service.setUP("a","aa");
    }
}
