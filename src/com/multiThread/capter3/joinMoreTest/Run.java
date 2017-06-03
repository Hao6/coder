package com.multiThread.capter3.joinMoreTest;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) {
        try{
            ThreadB b=new ThreadB();
            ThreadA a=new ThreadA(b);

            a.start();
            b.start();
            b.join(2000);   //在使用join方法时，可能会遇到执行顺序不确定的状况
            System.out.println("         main end"+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
