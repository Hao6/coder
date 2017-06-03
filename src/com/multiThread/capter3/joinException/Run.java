package com.multiThread.capter3.joinException;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) {

        try {
            ThreadB threadB = new ThreadB();
            threadB.start();

            Thread.sleep(1000);

            ThreadC c = new ThreadC(threadB);
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
