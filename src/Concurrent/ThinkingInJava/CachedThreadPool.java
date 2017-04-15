package Concurrent.ThinkingInJava;

import java.util.concurrent.*;


/**
 * Created by hongji on 2017/4/3.
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
            exec.execute(new Task1Print());
        }
        exec.shutdown(); //可以防止新任务被提交给这个Executor
    }
}
