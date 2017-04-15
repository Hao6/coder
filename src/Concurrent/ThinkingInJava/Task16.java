package Concurrent.ThinkingInJava;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hongji on 2017/4/5.
 */
class MutexThreeFuncsObject {
    private Object ob0 = new Object();
    private Object ob1 = new Object();
    private Lock lock = new ReentrantLock();
    private Lock lock1 = new ReentrantLock();

    int i = 0;

    public void f() {
        lock.lock();
        try {
            for (int j = 0; j < 10; j++) {
                System.out.println("f " + i++);
                Thread.yield();
            }
        } finally {
            lock.unlock();
        }
    }

    public void g() {
        lock1.lock();  //使用了不同的锁对象
        try {
            for (int j = 0; j < 5; j++) {
                System.out.println("g " + i++);
                Thread.yield();
            }
        } finally {
            lock1.unlock();
        }
    }

    public void k() {
        lock.lock();
        try {
            for (int j = 0; j < 5; j++) {
                System.out.println("k " + i++);
                Thread.yield();
            }
        } finally {
            lock.unlock(); //不释放锁，可能造成后面发生的线程无法进行
        }
    }
}
public class Task16 {
    public static void main(String []args){
    final MutexThreeFuncsObject tfo=new MutexThreeFuncsObject();
    final MutexThreeFuncsObject tfo1=new MutexThreeFuncsObject(); //调用方法时，相当于开辟了新的函数栈，
    // 不存在同步问题

        new Thread(){
        public void run(){
            tfo.f();
        }
    }.start();
        new Thread(){
        public void run(){
            tfo.g();
        }
    }.start();
        tfo.k();
}
}

