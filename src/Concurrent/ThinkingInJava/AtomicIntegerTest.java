package Concurrent.ThinkingInJava;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hongji on 2017/4/4.
 */
//原子类的测试
public class AtomicIntegerTest implements Runnable{

    private AtomicInteger i=new AtomicInteger(0); //原子类的操作不需要synchronized关键字加持
    public synchronized int  getValue(){
        return i.get();
    }
    public synchronized void eventIncrement(){
       i.addAndGet(2);
    }
    public void run(){
        while(true){
            eventIncrement();
        }
    }

    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.err.println("Aborting");
                System.exit(0);
            }
        },5000);
        ExecutorService exec= Executors.newCachedThreadPool();
        AtomicIntegerTest ait=new AtomicIntegerTest();
        exec.execute(ait);
        while(true){
            int val=ait.getValue();
            if(val%2!=0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
