package com.multiThread.capter1;

/**
 * Created by hao on 17-5-28.
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("I am a Runnable, a instance of Class MyRunnable!!!");
    }
}
