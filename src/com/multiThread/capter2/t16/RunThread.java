package com.multiThread.capter2.t16;


/**
 * Created by hao on 17-6-1.
 */
public class RunThread extends Thread{
    private  boolean isRunning=true;

    public boolean isRunning(){
        return isRunning;
    }

    public void setRunning(boolean isRunning){
        this.isRunning=isRunning;
    }

    @Override
    public void run(){
        System.out.println("进入run了");
        while(isRunning==true){
            //System.out.println("I am running");  //添加这一句后，就仿佛会提供给main线程机会
            // 得到时间，而没有这一句的话，则会进入无限循环，在执行这一句时，发生IO调用，线程放弃时间
            // 片，主线程乘机得到运行时间，如果事实是这样的话，那么说明1.8的-server选项不会优化程序，
            // or我没有使用-server选项？不是，还是会优化程序，否则就不会无限循环了，那输出时发生了什么
            // ？？
            int i=0;
            i++;
        }
        System.out.println("线程被停止了");
    }
}
