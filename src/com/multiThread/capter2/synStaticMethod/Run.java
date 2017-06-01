package com.multiThread.capter2.synStaticMethod;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String []args){
        ThreadA threadA=new ThreadA();
        threadA.setName("A");
        threadA.start();

        ThreadB threadB=new ThreadB();
        threadB.setName("B");
        threadB.start();

    }
}
