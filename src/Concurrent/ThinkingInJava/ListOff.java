package Concurrent.ThinkingInJava;

import java.util.concurrent.TimeUnit;

/**
 * Created by hongji on 2017/4/3.
 */
public class ListOff implements Runnable {
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public ListOff(){}
    public ListOff(int countDown){
        this.countDown=countDown;
    }
    public String status(){
        return "#"+id+"("+
                (countDown>0?countDown:"ListOff!")+"), ";
    }

    public void run(){
        //System.out.println("launch");
        while(countDown-->0){
            System.out.println(status());
            Thread.yield();  //对线程调度器的一种建议，声明最重要的已经执行了，此刻是切换给其
            // 他任务的最好时机
//            try {
//                TimeUnit.MILLISECONDS.sleep(100); //休眠100ms
//            }catch (InterruptedException e){
//                System.out.println(e);
//                return;
//            }
        }
        //System.out.println();
    }
}
