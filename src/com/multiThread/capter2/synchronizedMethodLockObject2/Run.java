package com.multiThread.capter2.synchronizedMethodLockObject2;

/**
 * Created by hongji on 2017/5/29.
 */
//锁是加在对象上的，不同的对象不存在线程安全与否的问题，只有不同的线程驱动同一个对象的任务时才会
// 出现线程安全与否的问题
public class Run {
    public static void main(String[] args) {
        MyObject object=new MyObject();
        ThreadA threadA=new ThreadA(object);
        threadA.setName("A");
        ThreadB threadB=new ThreadB(object);
        threadB.setName("B");
        threadA.start();
        threadB.start();
    }
}
