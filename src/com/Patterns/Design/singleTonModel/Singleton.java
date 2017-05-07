package com.Patterns.Design.singleTonModel;

/**
 * Created by hongji on 2017/3/5.
 */

/**
 * 饿汉式，线程安全，比较浪费资源，实例在类的生命周期内一直存活
 * 利用类的加载机制确保多线程安全，非延迟加载，可能造成内存浪费
 */
public class Singleton {
    int data;
    private static final  Singleton instance=new Singleton(5);
    private Singleton(int data){
        this.data=data;
    }
    public static Singleton getInstance(){
        return instance;
    }

    public static void main(String[] args) {
        Singleton newInstance=Singleton.getInstance();
        System.out.println(newInstance.data);
        Singleton newInstance1=Singleton.getInstance();
        newInstance1.data=10;
        System.out.println(newInstance.data);
        System.out.println(newInstance1.data);
        System.out.println(newInstance.equals(newInstance1));
        System.out.println(newInstance.hashCode()+" "+newInstance1.hashCode());
    }
}
