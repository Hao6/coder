package com.multiThread.capter2.setNewProperitiesLockOne;

/**
 * Created by hao on 17-6-1.
 */
public class ThreadB extends Thread{
    private Service service;
    private UserInfo userInfo;

    public ThreadB(Service service,UserInfo userInfo){
        this.service=service;
        this.userInfo=userInfo;
    }

    @Override
    public void run(){
        service.serviceMethodA(userInfo);
    }
}
