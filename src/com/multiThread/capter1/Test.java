package com.multiThread.capter1;

import static java.lang.Thread.sleep;

/**
 * Created by hao on 17-5-28.
 */
public class Test {  //线程启动顺序与调用顺序无关
    public static void main(String[] args) {

        try {
            MyThread thread=new MyThread();
            thread.setName("Test");
            thread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                MainTest mainTest=new MainTest();
                System.out.println(mainTest.getCurThread(Thread.currentThread())+
                mainTest.getCurThreadID(Thread.currentThread()));
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
