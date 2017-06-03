package com.multiThread.capter3.pCallWait;

/**
 * Created by hao on 17-6-3.
 */
public class P {
    private String lock;

    public P(String lock){
        this.lock=lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                while(!ValueObject.value.equals("")){
                    System.out.println("生产者"
                    +Thread.currentThread().getName()+" WAITING了");
                    lock.wait();
                }
                System.out.println("生产者"
                        +Thread.currentThread().getName()+" RUNNABLE");

                String value=System.currentTimeMillis()+"_"+
                        System.nanoTime();
                ValueObject.value=value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
