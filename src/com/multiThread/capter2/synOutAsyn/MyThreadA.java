package com.multiThread.capter2.synOutAsyn;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThreadA extends Thread {
    private MyList list;
    public MyThreadA(MyList list){
        super();
        this.list=list;
    }
    @Override
    public void run(){
        for(int i=0;i<10000;i++){
            list.add("threadA"+(i+1));
        }
    }
}
