package com.multiThread.capter1.t4_threadSafe;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by hao on 17-5-28.
 */
public class ALogin extends Thread{
    public void run(){
        LoginServlet.doPost("a","aa");
    }
}
