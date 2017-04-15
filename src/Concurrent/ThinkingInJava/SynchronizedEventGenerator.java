package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public class SynchronizedEventGenerator extends IntGenerator {
    private int currentEventValue=0;
    @Override
    public synchronized int next() { //确保了该方法操作的同步，理论上不会发生失败
        currentEventValue++;
        Thread.yield();
        currentEventValue++;
        return currentEventValue;
    }
    public static void main(String []args){
        EventChecker.test(new SynchronizedEventGenerator());
    }
}
