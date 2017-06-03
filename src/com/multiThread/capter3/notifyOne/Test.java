package com.multiThread.capter3.notifyOne;

/**
 * Created by hao on 17-6-2.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Object o=new Object();

        new ThreadA(o).start();
        new ThreadB(o).start();
        new ThreadC(o).start();

        Thread.sleep(1000);

        new Thread(new NotifyThread(o)).start();
    }
}
