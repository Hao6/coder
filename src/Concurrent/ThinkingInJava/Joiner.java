package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public class Joiner extends Thread {
    private Sleeper sleeper;
    public Joiner(String name,Sleeper sleeper){
        super(name);
        this.sleeper=sleeper;
        start();
    }
    public void run(){
        try {
            sleeper.join();  //等到sleeper线程驱动的任务执行结束后执行自身线程驱动的任务
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(getName()+" join completed");
    }
}
