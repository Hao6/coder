package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/5.
 */
class DualSynch{
    private Object syncObject=new Object();
    public synchronized void f(){
        for(int i=0;i<10;i++){
            System.out.println("f()");
            Thread.yield();
        }
    }
    public void g(){
        synchronized (syncObject){
            for(int i=0;i<10;i++){
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}
public class SyncObject {
    public static void main(String[] args) {
        final DualSynch ds=new DualSynch();
        final DualSynch ds1=new DualSynch();

        new Thread(){
            public void run(){
                ds.f();
            }
        }.start();
        ds1.g();
    }
}
