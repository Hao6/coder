package com.multiThread.capter3.joinMoreTest;

/**
 * Created by hao on 17-6-3.
 */
public class ThreadA extends Thread {
    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run(){
        try{
            synchronized (b){
                System.out.println("begin A "+System.currentTimeMillis()+
                " "+Thread.currentThread().getName() );
                Thread.sleep(5000);
                System.out.println("end A "+System.currentTimeMillis()+
                        " "+Thread.currentThread().getName() );
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
