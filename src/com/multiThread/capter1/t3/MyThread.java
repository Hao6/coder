package com.multiThread.capter1.t3;

import com.multiThread.capter1.MyRunnable;

/**
 * Created by hao on 17-5-28.
 */
public class MyThread extends Thread{
    private int count=5;
    public MyThread(String name){
        super();
        this.setName(name);
    }
    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由 "+this.currentThread().getName()
                    +" 计算 count="+count);
        }
    }

}
