package com.multiThread.capter3.pipeIOStream;

import java.io.PipedOutputStream;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadWrite extends Thread {
    private PipedOutputStream out;
    private WriteData writeData;

    public ThreadWrite(PipedOutputStream out, WriteData writeData) {
        this.out = out;
        this.writeData = writeData;
    }

    @Override
    public void run() {
        super.run();
        writeData.writeMethod(out);
    }
}
