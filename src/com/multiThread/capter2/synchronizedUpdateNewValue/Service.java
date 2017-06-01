package com.multiThread.capter2.synchronizedUpdateNewValue;

/**
 * Created by hao on 17-6-1.
 */
public class Service {
    private   boolean isRunning=true;


    public  void stopRunning(){
        this.isRunning=false;
    }

    public  void runMethod(){
        System.out.println("进入run了");
        String str=new String();
        while(isRunning==true){
            synchronized (str){  //将线程工作内存中的私有变量与公共内存中的变量同步的功能

            }
        }
        System.out.println("线程被停止了");
    }
}
