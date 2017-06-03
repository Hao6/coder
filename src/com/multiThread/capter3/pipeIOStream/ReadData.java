package com.multiThread.capter3.pipeIOStream;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * Created by hao on 17-6-3.
 */
public class ReadData {
    public void readMethod(PipedInputStream in){
        try{
            System.out.println("read:");
            byte[] bytes=new byte[20];
            int readLen=in.read(bytes);
            while(readLen!=-1){
                String newData=new String(bytes,0,readLen);
                System.out.println(newData);
                readLen=in.read(bytes);
            }
            System.out.println();
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
