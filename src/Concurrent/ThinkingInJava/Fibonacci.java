package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/3.
 */
public class Fibonacci implements Runnable {
    protected int n=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public Fibonacci(int n){
        this.n=n;
    }
    public StringBuilder nFibonacciChar(){
        if(n==1){
            return new StringBuilder("1");
        }else if(n<=0){
            return null;
        }
        int fb0=1,fb1=1,fb2=0;
        StringBuilder ret=new StringBuilder("11");
        for(int i=2;i<n;i++){
            fb2=fb1+fb0;
            fb0=fb1;
            fb1=fb2;
            ret.append(fb2);
        }
        return ret;
    }


    public void run(){
        StringBuilder result=nFibonacciChar();
        System.out.println(id+" "+result);
        Thread.yield();
    }
}
