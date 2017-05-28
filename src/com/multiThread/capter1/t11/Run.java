package com.multiThread.capter1.t11;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            Thread.sleep(2000);
            myThread.interrupt();   //interrupt()并没有停止线程，只是提供一个建议
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
