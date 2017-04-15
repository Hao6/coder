package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/3.
 */
public class Task1Print implements Runnable{
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public Task1Print(int countDown){
        this.countDown=countDown;
    }
    public Task1Print(){

    }
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println(id+" I am run task1Print "+i+"th");
            Thread.yield();
        }
        System.out.println(id+" is end");
    }

}
