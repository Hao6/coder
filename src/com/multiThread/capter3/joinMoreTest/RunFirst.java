package com.multiThread.capter3.joinMoreTest;

/**
 * Created by hao on 17-6-3.
 */
public class RunFirst {
    public static void main(String[] args) {

        ThreadB b = new ThreadB();
        ThreadA a = new ThreadA(b);

        a.start();
        b.start();

        System.out.println("         main end" + System.currentTimeMillis());

    }
}
