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
    public void printStringMethod(){
        try {
            while (isContinuePrint == true) {
                System.out.println("run printStringMethod threadname=" +
                        Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run(){
        printStringMethod();
    }
}
