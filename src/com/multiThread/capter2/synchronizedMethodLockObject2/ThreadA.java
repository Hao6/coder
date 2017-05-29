package com.multiThread.capter2.synchronizedMethodLockObject2;


/**
 * Created by hongji on 2017/5/29.
 */
public class ThreadA extends Thread{
    private MyObject objectA;
    public ThreadA(MyObject object){
        super();
        objectA=object;
    }
    @Override
    public void run(){
        objectA.methodA();
    }
}
