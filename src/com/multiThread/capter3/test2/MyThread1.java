package com.multiThread.capter3.test2;


/**
 * Created by hao on 17-6-2.
 */
public class MyThread1 extends Thread {
    private Object lock;
    public MyThread1(Object lock){
        this.lock=lock;
    }

    @Override
    public void run(){
        try{
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("开始wait() "+System.currentTimeMillis());
                lock.wait();  //进入等待状态，等待被唤醒进入Runnable状态
                System.out.println("结束wait() "+System.currentTimeMillis());
            }
            System.out.println("syn下面");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
