package com.multiThread.capter3.pCallWait;

/**
 * Created by hao on 17-6-3.
 */
public class C {
    private String lock;
    public C(String lock){
        this.lock=lock;
    }

    public void getValue(){
        try{
            synchronized (lock){
                while(ValueObject.value.equals("")){
                    System.out.println("消费者"
                            +Thread.currentThread().getName()+" WAITING了");
                    lock.wait();
                }
                System.out.println("消费者"
                        +Thread.currentThread().getName()+" RUNNABLE");
                ValueObject.value="";
//                lock.notify();
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
