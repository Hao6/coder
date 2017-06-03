package com.multiThread.capter3.joinTest2;

/**
 * Created by hao on 17-6-3.
 */
public class Test {
    public static void main(String[] args) {
        try{
            MyThread myThread=new MyThread();
            myThread.start();
            myThread.join();
            //join方法会使main线程无限阻塞，直到myThread线程执行结束
            System.out.println("当myThread线程对象驱动的任务完成后，我将执行");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
