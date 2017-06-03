package com.multiThread.capter3.pRTest;

/**
 * Created by hao on 17-6-2.
 */
public class P {
    private String lock;
    public P(String lock){
        this.lock=lock;
    }

    public void setValue(){
        try{
            synchronized (lock){
                if(!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value=System.currentTimeMillis()+"_"
                        +System.nanoTime();
                System.out.println("set的直是 ："+value);
                ValueObject.value=value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
