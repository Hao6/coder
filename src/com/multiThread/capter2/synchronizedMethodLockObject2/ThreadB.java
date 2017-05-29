package com.multiThread.capter2.synchronizedMethodLockObject2;

/**
 * Created by hongji on 2017/5/29.
 */
public class ThreadB extends Thread{
    private MyObject objectB;
    public ThreadB(MyObject object){
        super();
        objectB=object;
    }
    @Override
    public void run(){
        objectB.methodB();
    }
}
