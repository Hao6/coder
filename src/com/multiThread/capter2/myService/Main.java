package com.multiThread.capter2.myService;

/**
 * Created by hongji on 2017/5/29.
 */
public class Main  {
    public int i=10;
    public synchronized void operateIMainMethod(){

        try {
            i--;
            System.out.println("main print i="+i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
