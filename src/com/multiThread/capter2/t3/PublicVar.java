package com.multiThread.capter2.t3;

/**
 * Created by hongji on 2017/5/29.
 */
public class PublicVar {
    public String username="A";
    public String password="AA";
    public synchronized void setValue(String username,String password){
        try {
            this.username = username;
            Thread.sleep(5000);
            this.password = password;
            System.out.println("setValue method thread name="
                    + Thread.currentThread().getName() + " username=" + username
                    + " password=" + password);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public  void getValue(){
        System.out.println("setValue method thread name="
                + Thread.currentThread().getName() + " username=" + username
                + " password=" + password);
    }
}
