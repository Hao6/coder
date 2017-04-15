package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/3.
 */
public class BasicThread {
    public static void main(String[] args) {
        Thread t=new Thread(new ListOff());
        t.setDaemon(true); //后台线程随着调用main的线程结束而戛然而止

        t.start();
        System.out.println("Waiting for ListOff");  //最先被执行
    }
}
