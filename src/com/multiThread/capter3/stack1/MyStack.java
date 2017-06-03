package com.multiThread.capter3.stack1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao on 17-6-3.
 */
public class MyStack {
    private  List<String> list=new ArrayList<>();

    public synchronized void push(){
        try{
            while(list.size()==1){
                this.wait();
            }
            list.add("any"+Math.random());
            this.notifyAll();
            System.out.println("push="+list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public synchronized void pop(){
        String popValue="";
        try{
            while(list.size()==0){
                System.out.println("pop操作中的："+
                Thread.currentThread().getName()+" 线程等待状态");
                this.wait();
            }
            popValue=list.get(0);
            list.remove(0);
            this.notifyAll();  //唤醒了一个同类，导致list.get(0)爆出异常
            System.out.println("pop="+list.size());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
