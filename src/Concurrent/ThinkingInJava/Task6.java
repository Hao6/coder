package Concurrent.ThinkingInJava;

import org.omg.CORBA.TIMEOUT;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by hongji on 2017/4/4.
 */
public class Task6 implements Runnable {
    private static int count=0;
    private final int id=count++;
    private static Random random=new Random();
    long a=12L;
    public void run(){
        int  timeOfSleep=random.nextInt(10)+1;
        try{
            TimeUnit.MILLISECONDS.sleep(timeOfSleep);
        }catch (InterruptedException e){
            System.out.println(e);
            return;
        }
        System.out.println(id+" sleeps "+timeOfSleep+"ms");
    }
}
