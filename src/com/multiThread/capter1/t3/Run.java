package com.multiThread.capter1.t3;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        MyThread a=new MyThread("a");
        MyThread b=new MyThread("b");
        MyThread c=new MyThread("c");
        MyThread d=new MyThread("d");
        a.start();
        b.start();
        c.start();
        d.start();

    }
}
