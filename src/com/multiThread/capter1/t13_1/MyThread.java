package com.multiThread.capter1.t13_1;

/**
 * Created by hongji on 2017/5/29.
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.interrupted()) {
                    System.out.println("the current thread was interrupted!");
                    throw new InterruptedException();  //使用抛出异常的方式避免执行中断发生后的语句
                }
                System.out.println("i=" + (i + 1));
            }
            System.out.println("我被输出，如果我是for则继续运行，线程并未停止");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
