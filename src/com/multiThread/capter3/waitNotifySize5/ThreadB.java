package com.multiThread.capter3.waitNotifySize5;

/**
 * Created by hao on 17-6-2.
 */
public class ThreadB implements Runnable {

    private Object lock;

    public ThreadB(Object object) {
        lock = object;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    MyList.add();

                    if (MyList.size() == 5) {
                        lock.notify();

                        System.out.println("已发出通知");
                    }
                    System.out.println("添加了第 " + (i + 1) + "个元素");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

