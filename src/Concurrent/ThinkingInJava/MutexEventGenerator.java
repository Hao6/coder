package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
import sun.nio.cs.Surrogate;

import java.util.concurrent.locks.*;
public class MutexEventGenerator extends IntGenerator{
    private int currentEventValue=0;
    private Lock lock=new ReentrantLock();
    @Override
    public  int next() {
        lock.lock();   //使用显式的lock保护同步操作，理论是不会失败
        try {
            currentEventValue++;
            Thread.yield();
            currentEventValue++;
            return currentEventValue;
        }finally {
            lock.unlock();
        }

    }
    public static void main(String []args){
        EventChecker.test(new MutexEventGenerator(),1);
    }
}
