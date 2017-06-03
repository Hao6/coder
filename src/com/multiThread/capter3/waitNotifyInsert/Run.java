package com.multiThread.capter3.waitNotifyInsert;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) {
        DbTools dbTools=new DbTools();

        for(int i=0;i<20;i++) {
            BackA backA = new BackA(dbTools);
            backA.start();

            BackB backB = new BackB(dbTools);
            backB.start();
        }
    }
}
