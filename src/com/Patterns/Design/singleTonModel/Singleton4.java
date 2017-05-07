package com.Patterns.Design.singleTonModel;

/**
 * Created by hongji on 2017/4/7.
 */
//防止反序列化，天然单例，静态初始化，线程安全
public enum Singleton4 {
    INSTANCE;
    public void anyFuns(){

    }
}
