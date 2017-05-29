package com.multiThread.capter1.stopThrowLock;


/**
 * Created by hongji on 2017/5/29.
 */
public class Run {
    public static void main(String[] args) {
        try{
            SynchronizeObject object=new SynchronizeObject();
            MyThread myThread=new MyThread(object);
            myThread.start();
            myThread.sleep(1000);
            myThread.stop();   //stop（）方法不能保证数据一致性问题，可能会导致数据一致性被破坏，
            // 即使是同步方法也不行
            System.out.println(object.getUsername()+" "+object.getPassword());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
