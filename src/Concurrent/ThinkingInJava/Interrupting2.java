package Concurrent.ThinkingInJava;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

/**
 * Created by hongji on 2017/4/5.
 */
class BlockedMutex {
    private Lock lock = new ReentrantLock();

    public BlockedMutex() { //一旦调用构造器，直接获得对象的锁
        lock.lock();
    }

    public void f() {
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}
class Blocked2 implements Runnable{
    BlockedMutex blocked=new BlockedMutex();
    public void run(){
        System.out.println("Waiting for f() in BlockedMutex");
        blocked.f();
        System.out.println("Broken out of blocked call");
    }
}
public class Interrupting2 {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Blocked2());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Issuing t.interrupt()");
        t.interrupt();
    }
}
