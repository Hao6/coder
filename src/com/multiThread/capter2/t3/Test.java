package com.multiThread.capter2.t3;

/**
 * Created by hongji on 2017/5/29.
 */
public class Test {
    public static void main(String[] args) {
        try {
            PublicVar publicVar=new PublicVar();
            ThreadA threadA=new ThreadA(publicVar);
            threadA.start();
            Thread.sleep(200); //当线程休眠5秒时，getValue()方法被执行，得到了没有
            // 完全更新的结果
            publicVar.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
