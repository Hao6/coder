package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/5.
 */
class ThreeFuncsObject{
    private Object ob0=new Object();
    private Object ob1=new Object();

    int i=0;
    public synchronized void f(){
        for(int j=0;j<10;j++) {
            System.out.println("f "+i++);
            Thread.yield();
        }
    }
    public void g(){
        synchronized (this){
            for(int j=0;j<5;j++) {
                System.out.println("g "+i++);
                Thread.yield();
            }
        }
    }
    public void k(){
        synchronized (this){
            for(int j=0;j<5;j++) {
                System.out.println("k "+i++);
                Thread.yield();
            }
        }
    }
}
public class Task15 {
    public static void main(String []args){
        final ThreeFuncsObject tfo=new ThreeFuncsObject();
        final ThreeFuncsObject tfo1=new ThreeFuncsObject(); //调用方法时，相当于开辟了新的函数栈，
        // 不存在同步问题

        new Thread(){
            public void run(){
                tfo.f();
            }
        }.start();
        new Thread(){
            public void run(){
                tfo1.g();
            }
        }.start();
        tfo.k();
    }

}
