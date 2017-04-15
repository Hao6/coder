package com.Patterns.Design;

/**
 * Created by hongji on 2017/4/7.
 */
public class Singleton3 {
    int data;
    private Singleton3(){
        this.data=5;
    }
    private static class ForInstance{ //在调用时加载
        private static Singleton3 instance=new Singleton3();
    }
    public Singleton3 getInstance(){
        return ForInstance.instance;
    }
}
