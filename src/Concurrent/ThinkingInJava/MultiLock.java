package Concurrent.ThinkingInJava;

import java.nio.channels.MulticastChannel;

/**
 * Created by hongji on 2017/4/5.
 */
public class MultiLock {
    public synchronized void f(int count){

        if(count<=0){
            System.out.println("f "+count);

            return;

        }
        g(count-1);

    }
    public synchronized void g(int count){

        if(count<=0){
            System.out.println("g "+count);
            return;

        }
        f(count-1);
    }

    public static void main(String[] args) {
        final MultiLock multiLock=new MultiLock();
        new Thread(){
            public void run(){
                multiLock.f(10);
            }
        }.start();
    }
}
