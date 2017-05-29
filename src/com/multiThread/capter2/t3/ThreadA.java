package com.multiThread.capter2.t3;

/**
 * Created by hongji on 2017/5/29.
 */
public class ThreadA extends Thread{
    private PublicVar publicVar;
    public ThreadA(PublicVar publicVar){
        super();
        this.publicVar=publicVar;
    }
    @Override
    public void run(){
        publicVar.setValue("B","BB");
    }

}
