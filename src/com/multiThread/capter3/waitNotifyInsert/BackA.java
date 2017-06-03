package com.multiThread.capter3.waitNotifyInsert;

/**
 * Created by hao on 17-6-3.
 */
public class BackA extends Thread{
    private DbTools dbTools;

    public BackA(DbTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backA();
    }
}
