package com.multiThread.capter3.joinLong;

/**
 * Created by hao on 17-6-3.
 */
public class Test {
    public static void main(String[] args) {

        try {
            MyThread myThread=new MyThread();
            myThread.start();
            myThread.join(2000);
//                    Thread.sleep(2000);
            System.out.println("end timer="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
