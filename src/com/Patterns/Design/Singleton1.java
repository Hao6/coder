package com.Patterns.Design; /**
 * Created by hongji on 2017/3/5.
 */

/**
 * 单例模式，同步懒汉模式，缺点，每次调用函数都需要加锁，开销太大。
 */
public class Singleton1 {
    int data;
    private static Singleton1 instance=null;
    private Singleton1(int data){
        this.data=data;
    }
    public synchronized static Singleton1 getInstance(){  //使分配方法同步
        if(instance==null){   //no thread safe
            instance=new Singleton1(5);
        }
        return instance;
    }
    public static void main(String []args){
        Singleton1 newInstance= Singleton1.getInstance();
        System.out.println(newInstance.data);
        Singleton1 newInstance1= Singleton1.getInstance();
        newInstance1.data=10;
        System.out.println(newInstance1.data);
        System.out.println(newInstance.data);
        System.out.println(newInstance.equals(newInstance1));
        //newInstance=Singleton.getInstance();
    }
}
