package com.multiThread.capter1;


/**
 * Created by hao on 17-5-24.
 */

//Thread.currentThread()，返回当前代码段正在被哪个线程调用
//直接使用run方法，不会起到创建多线程的作用，仅当做普通方法调用
public class MainTest {

    public String getCurThread(Thread thread){
        return "当前线程： " + Thread.currentThread().getName();
    }
    public String getCurThreadID(Thread thread){
        return "当前线程ID： "+thread.getId();
    }

}
