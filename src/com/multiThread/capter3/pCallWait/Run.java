package com.multiThread.capter3.pCallWait;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);

        ThreadP [] threadP=new ThreadP[2];
        ThreadC [] threadC=new ThreadC[2];

        for(int i=0;i<2;i++){   //多生产者多消费者模型中，如果使用notify()，可能会唤醒同类型线程，
            // 导致所有线程均进入wait()状态，称为假死状态,避免假死状态可以使用notifyAll()唤醒所有
            // 等待中的线程
            threadP[i]=new ThreadP(p);
            threadP[i].setName("生产者"+(i+1));

            threadC[i]=new ThreadC(c);
            threadC[i].setName("消费者"+(i+1));

            threadC[i].start();
            threadP[i].start();
        }

        Thread.sleep(5000);
        Thread[] threads=new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);

        for(int i=0;i<threads.length;i++){
            System.out.println(threads[i].getName()+" "
            +threads[i].getState());
        }
    }
}
