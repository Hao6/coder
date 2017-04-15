package Concurrent.ThinkingInJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hongji on 2017/4/3.
 */
public class MoreBasicThreads {
    public static void main(String[] args) {
//        for(int i=0;i<10;i++){
//            new Thread(new ListOff()).start();
//        }
//        System.out.println("Waiting for ListOff!!");
//        ExecutorService exec= Executors.newCachedThreadPool();
//        for(int i=0;i<10;i++){
//            exec.execute(new ListOff());
//        }
//        exec.shutdown(); //可以防止新任务被提交给这个Executor
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            exec.execute(new Task6());
        }
        exec.shutdown(); //可以防止新任务被提交给这个Executor
    }
}
