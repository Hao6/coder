package com.multiThread.capter1.t4_threadSafe;

/**
 * Created by hao on 17-5-28.
 */
public class BLogin extends Thread {
    public void run(){
        LoginServlet.doPost("b","bb");
    }
}
