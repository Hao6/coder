package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public class EventGenerator extends IntGenerator {
    private int currentValue=0;
    public int next(){
        ++currentValue;  //非原子操作，可能产生不同步
        Thread.yield();   //增大不同步情况的发生
        ++currentValue;
        return currentValue;
    }
    public static void main(String []args){
        EventChecker.test(new EventGenerator(),10);
    }
}
