package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/3.
 */
public class MainThread {
    public static void main(String[] args) {
        ListOff launch=new ListOff();
        launch.run(); //由分配给main函数的线程调用另一个线程驱动run()函数中执行的任务
    }
}
