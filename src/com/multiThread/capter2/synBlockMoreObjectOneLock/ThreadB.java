package com.multiThread.capter2.synBlockMoreObjectOneLock;

/**
 * Created by hao on 17-6-1.
 */
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        service.printB();
    }
}
