package com.multiThread.capter3.joinException;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadA extends Thread {
    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            String newStr=new String();
            Math.random();
        }
    }
}
