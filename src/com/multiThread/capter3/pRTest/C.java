package com.multiThread.capter3.pRTest;

/**
 * Created by hao on 17-6-2.
 */
public class C {
    private String lock;
    public C(String lock){
        this.lock=lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                if(ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的直是："+ValueObject.value);
                ValueObject.value="";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
