package com.multiThread.capter3.waitNotifyInsert;

/**
 * Created by hao on 17-6-3.
 */
public class BackB extends Thread {
    private DbTools dbTools;

    public BackB(DbTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backB();
    }
}
