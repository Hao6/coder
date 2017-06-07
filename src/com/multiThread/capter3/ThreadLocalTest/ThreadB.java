package com.multiThread.capter3.ThreadLocalTest;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadB extends Thread {

    @Override
    public void run(){
        try{
            for(int i=0;i<100;i++){
                Tools.t1.set("ThreadB"+(i+1));
                System.out.println(Tools.t1.get());
                Thread.sleep(200);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
