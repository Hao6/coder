package Concurrent.ThinkingInJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hongji on 2017/4/3.
 */
public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newFixedThreadPool(5); //一次性分配够线程数量，
        // 避免线程分配的开销
        for(int i=0;i<10;i++){
            exec.execute(new Task1Print());
        }
        exec.shutdown();
    }
}
