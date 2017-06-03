package com.multiThread.capter3.joinTest2;

/**
 * Created by hao on 17-6-3.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try{
            int secondValue=(int)(Math.random()*10000);
            System.out.println(secondValue);
            if(secondValue%2==0)
                throw new RuntimeException();
            Thread.sleep(secondValue);
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
}
