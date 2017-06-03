package com.multiThread.capter3.joinSleep1;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b) {
                b.start();

                //Thread.sleep(6000);
                b.join();
//                for(int i=0;i<Integer.MAX_VALUE;i++){
//                    Math.random();
//                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
