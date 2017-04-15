package Concurrent.ThinkingInJava;

import java.util.concurrent.*;

/**
 * Created by hongji on 2017/4/4.
 */
public class ExceptionThread implements Runnable  {
    public void run(){
        throw new RuntimeException(); //这个异常不能传播到main()函数中
    }
    public static void main(String []args){
        ExecutorService exec=Executors.newCachedThreadPool();
        exec.execute(new ExceptionThread());
        exec.shutdown();
    }
}
