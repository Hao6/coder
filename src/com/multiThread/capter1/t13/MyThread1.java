package com.multiThread.capter1.t13;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread1 extends Thread {
    @Override
    public void run(){
//        super.run();     //这一句可以不要吗？？？，貌似是没有影响，目前还是没有影响
        for(int i=0;i<500000;i++){
            if(this.isInterrupted()){
                System.out.println("the current thread was interrupted!");
                break;
            }
            System.out.println("i="+(i+1));
        }
        System.out.println("我被输出，如果我是for则继续运行，线程并未停止");

    }
}
