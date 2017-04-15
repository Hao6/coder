package Concurrent.ThinkingInJava;

import java.sql.Time;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by hongji on 2017/4/5.
 */
class Car{
    private boolean waxOn=false;
    public synchronized void waxed(){ //涂蜡
        waxOn=true;
        notifyAll();
    }
    public synchronized void buffed(){ //抛光
        waxOn=false;
        notifyAll();
    }
    public synchronized void waitForBuffing() throws InterruptedException {
        while(waxOn==true){
            wait();
        }
    }
}
class WaxOn implements Runnable{
    private Car car;

    public WaxOn(Car car) {
        this.car = car;
    }
    public void run(){
        try{
            while(!Thread.interrupted()){
                System.out.println("Wax on");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                car.waitForBuffing();
            }
        }catch(InterruptedException e){
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax On task");
    }
}
class WaxOff implements Runnable{
    private Car car;

    public WaxOff(Car car) {
        this.car = car;
    }
    public void run(){
        try{
            while(!Thread.interrupted()){
                car.waitForBuffing();
                System.out.println("Wax off");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        }catch(InterruptedException e){
            System.out.println("Exiting via interrupt");
        }
        System.out.println("Ending Wax Off task");
    }
}
public class WaxOMatic {
    public static void main(String []args) throws Exception{
        Car car=new Car();
        ExecutorService exec= Executors.newCachedThreadPool();
        exec.execute(new WaxOn(car));
        exec.execute(new WaxOff(car));
        TimeUnit.MILLISECONDS.sleep(2000);
        exec.shutdownNow();
    }
}
