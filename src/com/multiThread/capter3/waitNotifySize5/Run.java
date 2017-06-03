package com.multiThread.capter3.waitNotifySize5;

/**
 * Created by hao on 17-6-2.
 */
public class Run {
    public static void main(String[] args) {
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();

            Thread.sleep(50);

            ThreadB b = new ThreadB(lock);
            new Thread(b).start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
