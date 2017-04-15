package Concurrent.ThinkingInJava;

import java.io.IOException;

/**
 * Created by hongji on 2017/4/4.
 */
public class ResponsiveUI extends Thread {
    private static volatile double d=1;
    public ResponsiveUI(){
        setDaemon(true);
        start();
    }
    public void run(){
        while(true){
            d=d+(Math.PI+Math.E)/d;
        }
    }
    public static void main(String []args) throws Exception {
        new ResponsiveUI();
        System.in.read();
        System.out.println(d);
    }
}
