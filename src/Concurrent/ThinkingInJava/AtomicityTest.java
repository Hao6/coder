package Concurrent.ThinkingInJava;

import java.util.concurrent.*;

/**
 * Created by hongji on 2017/4/4.
 */
public class AtomicityTest implements Runnable {
    private int i=0;
    public synchronized int  getValue(){
        return i;
    }
    public synchronized void eventIncrement(){
        i++;
        Thread.yield();
        i++;
    }
    public void run(){
        while(true){
            eventIncrement();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec= Executors.newCachedThreadPool();
        AtomicityTest at=new AtomicityTest();
        exec.execute(at);
        while(true){
            int val=at.getValue();
            if(val%2!=0){
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
