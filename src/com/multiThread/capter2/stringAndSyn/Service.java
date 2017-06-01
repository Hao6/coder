package com.multiThread.capter2.stringAndSyn;

/**
 * Created by hao on 17-6-1.
 */
public class Service {
    public  static void print(String stringParam) {
        try {
            synchronized (stringParam) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
