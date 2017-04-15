package Concurrent.ThinkingInJava;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hongji on 2017/4/4.
 */
public class DaemonThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        Thread t=new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
