package com.multiThread.capter3.waitNotifyInsert;

/**
 * Created by hao on 17-6-3.
 */
public class DbTools {
    private volatile boolean prevIsA = false;

    public synchronized void backA() {

        try {
            while (prevIsA == true) {
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("I am A");
            }
            prevIsA = true;
            this.notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void backB() {

        try {
            while (prevIsA == false) {
                this.wait();
            }
            for (int i = 0; i < 5; i++) {
                System.out.println("I am B");
            }
            prevIsA = false;
            this.notifyAll();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
