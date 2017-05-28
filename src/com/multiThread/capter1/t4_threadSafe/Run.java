package com.multiThread.capter1.t4_threadSafe;

import Concurrent.ThinkingInJava.unit19.AlarmPoints;

/**
 * Created by hao on 17-5-28.
 */
public class Run {
    public static void main(String []args){
        ALogin a=new ALogin();
        a.start();
        BLogin b=new BLogin();
        b.start();
    }
}
