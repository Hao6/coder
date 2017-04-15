package Concurrent.ThinkingInJava;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by hongji on 2017/4/3.
 */
public class SingleThreadPool {
    public static void main(String[] args) {
        ExecutorService exec= Executors.newSingleThreadExecutor(); //单线程操作，用于服务器端
        // socket监听队列等服务，隐蔽性高，为什么需要隐蔽？？？
        for(int i=0;i<10;i++){
            exec.execute(new Task1Print());
        }
        exec.shutdown();
    }
}
