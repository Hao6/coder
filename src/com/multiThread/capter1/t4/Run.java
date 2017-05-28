package com.multiThread.capter1.t4;


/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
//        由6个线程驱动完成一个线程的任务，面临着线程非安全的情况
        Thread a=new Thread(myThread,"a");
        Thread b=new Thread(myThread,"b");
        Thread c=new Thread(myThread,"c");
        Thread d=new Thread(myThread,"d");
        Thread e=new Thread(myThread,"e");
        Thread f=new Thread(myThread,"f");

        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        f.start();


    }
}
