package com.multiThread.capter3.test1;

/**
 * Created by hao on 17-6-2.
 */
public class Test2 {
    public static void main(String[] args) {
        try{
            String lock=new String();
            System.out.println("syn上面");
            synchronized (lock){
                System.out.println("syn第一行");
                lock.wait();  //进入等待状态，等待被唤醒进入Runnable状态
                System.out.println("wait下面的代码");
            }
            System.out.println("syn下面");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
