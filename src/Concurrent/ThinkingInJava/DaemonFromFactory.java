package Concurrent.ThinkingInJava;

import java.util.concurrent.*;

/**
 * Created by hongji on 2017/4/4.
 */
public class DaemonFromFactory implements Runnable {
    @Override
    public void run() {
        try{
            while(true) {
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println(Thread.currentThread()+" "+this);
            }
        }catch (InterruptedException e){
            System.out.println(e);
            return;
        }
    }
    public static void main(String []args){
        ExecutorService exec= Executors.newCachedThreadPool(new DaemonThreadFactory());
        for(int i=0;i<10;i++){
            exec.execute(new DaemonFromFactory());
        }
        System.out.println("All daemons started");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
