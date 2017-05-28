package com.multiThread.capter1;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println("I am a Thread, a instance of Class MyThread");

        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println(new MainTest().getCurThread(Thread.currentThread()));

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
