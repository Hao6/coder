package Concurrent.ThinkingInJava;

import java.util.concurrent.TimeUnit;

/**
 * Created by hongji on 2017/4/5.
 */
class NeedsCleanUp {
    private final int id;

    public NeedsCleanUp(int id) {
        this.id = id;
        System.out.println("NeedsUp " + id);
    }

    public void cleanUp() {
        System.out.println("Clean up " + id);
    }
}

class Blocked3 implements Runnable {
    private volatile double d = 0.0;

    public void run() {
        try {
            while (!Thread.interrupted()) {
                NeedsCleanUp n1 = new NeedsCleanUp(1);
                try {
                    System.out.println("Sleeping");
                    TimeUnit.SECONDS.sleep(1);
                    NeedsCleanUp n2 = new NeedsCleanUp(2);
                    try {
                        System.out.println("Calculating");
                        for (int i = 0; i < 2500000; i++) {
                            d = d + (Math.PI + Math.E) / d;
                        }
                        System.out.println("Finished");
                    } finally {
                        n2.cleanUp();
                    }
                } finally {
                    n1.cleanUp();
                }
            }
            System.out.println("Exiting via while() test");
        } catch (InterruptedException e) {
            System.out.println("Exiting via InterruptedException");
        }
    }
}

public class InterruptingIdiom {
    public static void main(String[] args) throws Exception{
        if(args.length!=1){
            System.out.println("xxxxxxxx");
            System.exit(0);
        }
        Thread t=new Thread(new Blocked3());
        t.start();
        TimeUnit.MILLISECONDS.sleep(new Integer(args[0]));
        t.interrupt();
    }
}
