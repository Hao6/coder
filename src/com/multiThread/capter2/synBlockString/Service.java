package com.multiThread.capter2.synBlockString;

/**
 * Created by hongji on 2017/5/29.
 */
public class Service {
    private String usernameParam;
    private String passwordParam;
    String anyString=new String();
    public void setUP(String username,String password){
        try{

            synchronized (anyString){
                System.out.println("当前线程是:"+Thread.currentThread().getName()
                +" 在"+System.currentTimeMillis()+"进入同步块");
                usernameParam=username;
                Thread.sleep(3000);
                passwordParam=password;
                System.out.println("当前线程是:"+Thread.currentThread().getName()
                        +" 在"+System.currentTimeMillis()+"离开同步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
