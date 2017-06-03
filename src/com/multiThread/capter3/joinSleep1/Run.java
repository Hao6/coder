package com.multiThread.capter3.joinSleep1;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) {

        //try {
            ThreadB b=new ThreadB();
            ThreadA a =new ThreadA(b);
            a.start();

            //Thread.sleep(1000);

            ThreadC c=new ThreadC(b);
            c.start();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
