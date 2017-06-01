package com.multiThread.capter2.innerTest1;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner=new OutClass.Inner();
        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1();
            }
        },"A");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"B");
        t1.start();
        t2.start();
    }
}
