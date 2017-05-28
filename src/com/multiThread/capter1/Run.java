package com.multiThread.capter1;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        System.out.println(new MainTest().getCurThread(Thread.currentThread()));
        System.out.println("I am a Class runner, I will running myThread");
        //new MyThread().start();  //启动线程，驱动run方法中携带的任务
        MyRunnable mR=new MyRunnable();
        new Thread(mR).start();    //启动线程的第二种方式，驱动run方法中携带的任务，由于new Thread（）
        //接受一个Runnable类型的参数，并且提供启动机会，所以也可以传入一个Thread对象，让另一个线程驱动本线程
        // 的任务
        System.out.println("running over!!");   //这一句可能在上一句之前发生，说明了线程调用的随机性
    }
}
