package com.multiThread.capter2.t16;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String []args){
        try{
            RunThread runThread=new RunThread();
            runThread.start();
            Thread.sleep(1000);
            runThread.setRunning(false);
            System.out.println("赋值为false");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
