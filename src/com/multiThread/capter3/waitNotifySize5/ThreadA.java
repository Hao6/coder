package com.multiThread.capter3.waitNotifySize5;

/**
 * Created by hao on 17-6-2.
 */
public class ThreadA extends Thread {
    private Object lock;

    public ThreadA(Object object) {
        lock = object;
    }

    @Override

    public void run() {
        try {
            synchronized (lock) {

                if (MyList.size() != 5) {
                    System.out.println("开始wait() " + System.currentTimeMillis());
                    lock.wait();  //进入等待状态，等待被唤醒进入Runnable状态
                    System.out.println("结束wait() " + System.currentTimeMillis());
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
