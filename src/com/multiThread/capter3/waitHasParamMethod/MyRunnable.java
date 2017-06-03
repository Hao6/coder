package com.multiThread.capter3.waitHasParamMethod;

/**
 * Created by hao on 17-6-2.
 */
public class MyRunnable {
    private static Object lock = new Object();
    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock) {  //根据传入的参数加锁，wait()函数释放锁后，其他Thread进入同步块
                    System.out.println(Thread.currentThread().getName() + " begin wait in " +
                            System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println(Thread.currentThread().getName() + " end wait in " +
                            System.currentTimeMillis());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {  //根据传入的参数加锁，wait()函数释放锁后，其他Thread进入同步块
                System.out.println(Thread.currentThread().getName() + " begin notify in " +
                        System.currentTimeMillis());
                lock.notify();
                System.out.println(Thread.currentThread().getName() + " end notify in " +
                        System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) {


        try {
            Thread t = new Thread(runnable);
            t.start();
            Thread.sleep(3000);
            Thread t1 = new Thread(runnable1);
            t1.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
