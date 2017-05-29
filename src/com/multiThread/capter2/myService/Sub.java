package com.multiThread.capter2.myService;

/**
 * Created by hongji on 2017/5/29.
 */
public class Sub extends  Main {
    public synchronized void operateIMainMethod(){
        try {
            while(i>0) {
                i--;
                System.out.println("sub print i=" + i);
                Thread.sleep(1000);
                super.operateIMainMethod();    //可重入锁机制可以在继承上下文
                // 环境中使用，即子类调用父类中的同步方法也可以
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
