package com.multiThread.capter2.synBlockMoreObjectOneLock;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String []args){
        Service service=new Service();
        Service service1=new Service();

        ThreadA threadA=new ThreadA(service);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB=new ThreadB(service1);
        threadB.setName("B");
        threadB.start();

    }
}
