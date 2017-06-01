package com.multiThread.capter2.twoStop;

/**
 * Created by hao on 17-6-1.
 */
public class ThreadA extends Thread {
    private Service service;
    public ThreadA(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        service.methodA();
    }
}
