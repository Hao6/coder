package com.multiThread.capter1.stopThrowLock;

/**
 * Created by hongji on 2017/5/29.
 */
public class SynchronizeObject {
    private String username="a";
    private String password="aa";

    public synchronized String getUsername() {
        return username;
    }

    public synchronized String getPassword() {
        return password;
    }

    public synchronized void setUsername(String username) {
        this.username = username;
    }

    public synchronized void setPassword(String password) {
        this.password = password;
    }
    public synchronized void printString(String username,String password){
        try{
            this.username=username;
            Thread.sleep(1000);
            this.password=password;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
