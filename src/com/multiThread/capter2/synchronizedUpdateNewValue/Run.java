package com.multiThread.capter2.synchronizedUpdateNewValue;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service=new Service();
            ThreadA a =new ThreadA(service);
            a.start();

            Thread.sleep(1000);

            ThreadB b=new ThreadB(service);
            b.start();
            System.out.println("已发起停止");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
