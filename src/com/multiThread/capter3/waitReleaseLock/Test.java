package com.multiThread.capter3.waitReleaseLock;

/**
 * Created by hao on 17-6-2.
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.setName("A not B");
        a.start();

        new Thread(new ThreadB(lock)).start();
    }
}
