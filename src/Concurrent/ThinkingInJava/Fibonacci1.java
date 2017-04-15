package Concurrent.ThinkingInJava;

import java.util.concurrent.Callable;

/**
 * Created by hongji on 2017/4/3.
 */
public class Fibonacci1 implements Callable<String> {
    protected int n=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public Fibonacci1(int n){
        this.n=n;
    }
    public int getSumOfNFibonacci(){
        if(n==1){
            return 1;
        }else if(n<=0){
            return -1;
        }
        int fb0=1,fb1=1,fb2=0,sum=fb0+fb1;
        for(int i=2;i<n;i++){
            fb2=fb1+fb0;
            fb0=fb1;
            fb1=fb2;
            sum+=fb2;
        }
        return sum;
    }
    public String call(){
        return id+" "+getSumOfNFibonacci();
    }
}
