package com.multiThread.capter1.isAliveOtherTest;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String[] args) {
        CountOperate countOperate=new CountOperate();
        Thread t1=new Thread(countOperate);
        System.out.println("main begin t1 isAlive="+t1.isAlive());
        t1.setName("A");
        t1.start();
        System.out.println("main begin t1 isAlive="+t1.isAlive());
    }
}
