package com.multiThread.capter2.synOutAsyn;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThreadB extends Thread {
    private MyList list;
    public MyThreadB(MyList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            list.add("threadB"+(i+1));
        }
    }
}
