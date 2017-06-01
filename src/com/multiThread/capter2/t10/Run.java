package com.multiThread.capter2.t10;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        PrintString printStringService=new PrintString();
        new Thread(printStringService).start();
        System.out.println("我要停止他 stopThread="+
        Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
    }
}
