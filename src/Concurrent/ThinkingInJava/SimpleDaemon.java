package Concurrent.ThinkingInJava;
import java.util.concurrent.*;
/**
 * Created by hongji on 2017/4/4.
 */
public class SimpleDaemon implements Runnable{

    @Override
    public void run() {
        try{
            while(true) {
                TimeUnit.MILLISECONDS.sleep(175);
                System.out.println(Thread.currentThread()+" "+this);
            }
        }catch (InterruptedException e){
            System.out.println(e);
            return;
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread daemon=new Thread(new SimpleDaemon());
            daemon.setDaemon(true);  //Must call before start
            daemon.start();
        }
        System.out.println("All daemons started");
        try {
            TimeUnit.MILLISECONDS.sleep(175);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
