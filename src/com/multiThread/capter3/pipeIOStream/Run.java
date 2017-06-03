package com.multiThread.capter3.pipeIOStream;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) throws Exception {
        WriteData writeData=new WriteData();
        ReadData readData=new ReadData();

        PipedOutputStream out=new PipedOutputStream();
        PipedInputStream input=new PipedInputStream();

        input.connect(out);



        ThreadRead threadRead=new ThreadRead(input,readData);
        threadRead.start();
        Thread.sleep(1000);

        ThreadWrite threadWrite=new ThreadWrite(out,writeData);
        threadWrite.start();

    }
}
