package Concurrent.ThinkingInJava;

import java.util.ArrayList;
import java.util.concurrent.*;

import static cn.edu.redSkyline.Util.*;

/**
 * Created by hongji on 2017/4/3.
 */
public class Task2Generic {
    public static void main(String[] args) {
//        ExecutorService exec= Executors.newCachedThreadPool();
//        for(int i=0;i<100;i++){
//            exec.execute(new Fibonacci(i+2));
//        }
//        exec.shutdown();
//        ExecutorService exec= Executors.newSingleThreadExecutor();
//        for(int i=0;i<100;i++){
//            exec.execute(new Fibonacci(i+2));
//        }
//        exec.shutdown();
//        ExecutorService exec= Executors.newFixedThreadPool(10);
//        for(int i=0;i<100;i++){
//            exec.execute(new Fibonacci(i+2));
//        }
//        exec.shutdown();
        //printDividingLine(30);
//        for(int i=0;i<10;i++){
//            new Thread(new Fibonacci(i+2)).start();
//        }
        ExecutorService exec= Executors.newFixedThreadPool(5);
        ArrayList<Future<String>> results=new ArrayList<Future<String>>();
        for(int i=0;i<40;i++){
            results.add(exec.submit(new Fibonacci1(i+2)));
        }
        for(Future<String> temp:results){
            try{
                System.out.println(temp.get());
            }catch(InterruptedException e){
                System.out.println(e);
                return;
            }catch (ExecutionException e){
                System.out.println(e);
                return;
            }finally {
                exec.shutdown();
            }
        }
    }
}
