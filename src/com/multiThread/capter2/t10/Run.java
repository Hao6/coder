package com.multiThread.capter2.t10;

/**
 * Created by hao on 17-6-1.
 */
public class Run {
    public static void main(String[] args) {
        try {
            PrintString printStringService = new PrintString();
            new Thread(printStringService).start();

            Thread.sleep(1000);   //为什么不会无限循环，而且根据输出结果，貌似main线程
            // 一旦更新isContinueRunning的状态，Thread-0线程立即就会知道，为什么？？？
            System.out.println("我要停止他 stopThread=" +
                    Thread.currentThread().getName());
            printStringService.setContinuePrint(false);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
