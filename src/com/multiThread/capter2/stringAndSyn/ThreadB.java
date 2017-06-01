package com.multiThread.capter2.stringAndSyn;

/**
 * Created by hao on 17-6-1.
 */
//由于String常量池中的不同引用指向相同的字符串，所以如果使用字符串作为同步代码块的加锁对象，则
// 可能导致一个线程永远不能得到锁
public class ThreadB extends Thread{
    private Service service;
    public ThreadB(Service service){
        this.service=service;
    }
    @Override
    public void run(){
        service.print("AA");
    }
}
