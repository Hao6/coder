package com.multiThread.capter2.twoStop;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);

        threadA.start();


        ThreadB threadB = new ThreadB(service);

        threadB.start();

    }
}
