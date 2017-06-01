package com.multiThread.capter2.setNewProperitiesLockOne;

/**
 * Created by hao on 17-6-1.
 */
public class Service {
    public void serviceMethodA(UserInfo userInfo){
        synchronized (userInfo){
            try{
                System.out.println(Thread.currentThread().getName());
                userInfo.setUsername("hello");
                Thread.sleep(3000);
                System.out.println("end ! time="+System.currentTimeMillis());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
