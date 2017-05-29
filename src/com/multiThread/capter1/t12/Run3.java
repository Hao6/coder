package com.multiThread.capter1.t12;

/**
 * Created by hongji on 2017/5/29.
 */
//public boolean isInterrupted()检测当前线程是否处于中断状态，不会清除状态标志
public class Run3 {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ ="+myThread.isInterrupted());
            System.out.println("是否停止2？ ="+myThread.isInterrupted());

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
