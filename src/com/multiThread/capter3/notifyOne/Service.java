package com.multiThread.capter3.notifyOne;

/**
 * Created by hao on 17-6-2.
 */
public class Service {
    public void testMethod(Object lock) {
        try {
            synchronized (lock) {  //根据传入的参数加锁，wait()函数释放锁后，其他Thread进入同步块
                System.out.println(Thread.currentThread().getName() + " begin wait");
                lock.wait();
                System.out.println(Thread.currentThread().getName() + " end wait");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
