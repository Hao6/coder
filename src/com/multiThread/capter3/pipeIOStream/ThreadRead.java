package com.multiThread.capter3.pipeIOStream;

import java.io.PipedInputStream;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadRead extends Thread {
    private PipedInputStream input;
    private ReadData readData;

    public ThreadRead(PipedInputStream input, ReadData readData) {
        this.input = input;
        this.readData = readData;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }
}
