package Concurrent.ThinkingInJava;

import java.util.concurrent.*;

/**
 * Created by hongji on 2017/4/4.
 */
public class EventChecker implements Runnable {
    private IntGenerator generator;
    private final int id;
    public EventChecker(IntGenerator g,int ident){
        generator=g;
        id=ident;
    }
    public void run(){
        while(!generator.isCanceled()){
            int val=generator.next();
            if(val % 2!=0){
                System.out.println(val+" not even!");
                generator.cancel();
            }
            if(val==Integer.MAX_VALUE-1){
                System.out.println("now ,is max value");
            }
        }
    }
    public static void test(IntGenerator gp,int count){
        System.out.println("Press Ctrl-C to exit");
        ExecutorService exec=Executors.newCachedThreadPool();
        for(int i=0;i<count;i++){
            exec.execute(new EventChecker(gp,i));
        }
        exec.shutdown();
    }
    public static void test(IntGenerator gp){
        test(gp,10);
    }
}
