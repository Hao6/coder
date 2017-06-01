package com.multiThread.capter2.t10;

/**
 * Created by hao on 17-6-1.
 */
public class PrintString implements Runnable {
    private boolean isContinuePrint=true;
    public boolean isContinuePrint(){
        return isContinuePrint;
    }
    public void setContinuePrint(boolean isContinuePrint){
        this.isContinuePrint=isContinuePrint;
    }

    @Override
    public void run(){

        while (isContinuePrint == true) {
            System.out.println("run printStringMethod threadname=" +
                    Thread.currentThread().getName());
            //只要使用输出，不管使用还是没有使用-server，仍旧会被打扰到

        }
        System.out.println("isContinuePrint == false");
    }
}
