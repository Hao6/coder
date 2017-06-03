package com.multiThread.capter3.test1;

/**
 * Created by hao on 17-6-2.
 */
public class Test1 {
    public static void main(String[] args) {
        try{
            String str=new String("");
            //Exception in thread "main" java.lang.IllegalMonitorStateException
            str.wait();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
