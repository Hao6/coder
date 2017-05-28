package com.multiThread.capter1.t4;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread {
    private int count = 5;

    public synchronized void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName()
                + " 计算 count=" + count);
    }

}
