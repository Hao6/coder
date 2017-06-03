package com.multiThread.capter3.ThreadLocal11;

/**
 * Created by hao on 17-6-3.
 */

//类ThreadLocal解决的问题是，变量在不同线程之间的隔离性，也就是不同线程拥有自己的直
public class Run {
    public static ThreadLocal t1=new ThreadLocal();
    public static void main(String []args){
        if(t1.get()==null){
            System.out.println("从未放过直");
            t1.set("我的直");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
