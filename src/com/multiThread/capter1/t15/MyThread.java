package com.multiThread.capter1.t15;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        try{
            for(int i=0;i<100000;i++){
                System.out.println("i="+(i+1));
            }
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");

        }catch (InterruptedException e){
            System.out.println("先中断，然后休眠，进入catch");
            e.printStackTrace();
        }
    }
}
