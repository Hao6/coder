package com.multiThread.capter1.sameNum;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread {
    private int i = 5;
//  虽然System.out.println是同步方法，但是i--实在该函数调用之前发生的，所以还是会
// 面临非线程安全的情况，这也是一个多线程的陷阱
    public  void run() {
        super.run();
        System.out.println("i= "+(i--) + " " +this.currentThread().getName());
    }

}
