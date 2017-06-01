package com.multiThread.capter2.innerTest2;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        final OutClass.Inner inner=new OutClass.Inner();
        final OutClass.InnerClass2 inner2=new OutClass.InnerClass2();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method1(inner2);
            }
        },"T1");
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                inner.method2();
            }
        },"T2");

        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                inner2.method1();
            }
        },"T3");
        t1.start();
        t2.start();
        t3.start();
    }
}
