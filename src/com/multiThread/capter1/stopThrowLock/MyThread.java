package com.multiThread.capter1.stopThrowLock;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    private SynchronizeObject synchronizeObject;
    @Override
    public void run(){
        synchronizeObject.printString("b","bb");
    }
    public MyThread(SynchronizeObject object){
        super();
        synchronizeObject=object;
    }
}
