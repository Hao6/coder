package com.multiThread.capter1.t7;

/**
 * Created by hao on 17-5-28.
 */
//new Thread().isAlive()方法判断当前线程是否处于活动状态
//    所谓活动状态，就是线程已经启动且尚未终止，线程处于正在
// 运行或者准备开始运行的状态
public class MyThread extends Thread {
    public void run(){
        System.out.println("run="+this.isAlive());
    }
}
