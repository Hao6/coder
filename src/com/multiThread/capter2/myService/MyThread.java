package com.multiThread.capter2.myService;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        Sub sub=new Sub();
        sub.operateIMainMethod();
    }
}
