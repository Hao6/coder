package Concurrent.ThinkingInJava;


import java.util.concurrent.TimeUnit;

/**
 * Created by hongji on 2017/4/4.
 */
public class SimpleThread extends Thread {
    private int countDown=5;
    private static int threadCount=0;
    public SimpleThread(){
        super(Integer.toString(threadCount++));
        setDaemon(true);
        start();
    }

    @Override
    public String toString() {
        return "#" +getName()+
                "(" + countDown +
                ") ,";
    }
    public void run(){
        while(true){
            System.out.println(this);
            if(countDown--==0)
                return;
        }
    }
    public static void main(String []args){
        for(int i=0;i<10;i++){
            new SimpleThread();
        }
//        try {
//            TimeUnit.MILLISECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("main is end");
    }
}
