package com.multiThread.capter3.notifyHoldLock;

/**
 * Created by hao on 17-6-2.
 */
public class Test {
    public static void main(String[] args) {
        Object lock=new Object();
        ThreadA a=new ThreadA(lock);
        a.setName("A");
        a.start();

        new Thread(new NotifyThread(lock)).start();

        new SynNotifyMethodThread(lock).start();
    }
}
