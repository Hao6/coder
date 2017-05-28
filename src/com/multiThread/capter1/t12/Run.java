package com.multiThread.capter1.t12;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(1000);
            myThread.interrupt();
            System.out.println("是否停止1？ ="+myThread.interrupted());
            System.out.println("是否停止2？ ="+myThread.interrupted());

        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
