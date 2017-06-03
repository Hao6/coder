package com.multiThread.capter3.pipeIOStream;

import java.io.IOException;
import java.io.PipedOutputStream;

/**
 * Created by hao on 17-6-3.
 */
public class WriteData {
    public void writeMethod(PipedOutputStream out) {

        try {
            System.out.println("write:");
            for (int i = 0; i < 250; i++) {
                String outData = "" + (i + 1);
                out.write(outData.getBytes());
                System.out.print(outData);
            }
            out.close();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

