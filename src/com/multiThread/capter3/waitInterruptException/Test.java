package com.multiThread.capter3.waitInterruptException;

/**
 * Created by hao on 17-6-2.
 */
public class Test {
    public static void main(String[] args) {
        try {
            Object o = new Object();
            ThreadA a = new ThreadA(o);
            a.start();
            Thread.sleep(1000);
            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
