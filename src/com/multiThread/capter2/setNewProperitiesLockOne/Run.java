package com.multiThread.capter2.setNewProperitiesLockOne;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        try{
            Service service=new Service();
            UserInfo userInfo=new UserInfo();

            ThreadA a=new ThreadA(service,userInfo);
            a.setName("A");
            a.start();

            Thread.sleep(100);

            ThreadB b=new ThreadB(service,userInfo);
            b.setName("B");
            b.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
