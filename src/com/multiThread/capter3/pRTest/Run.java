package com.multiThread.capter3.pRTest;

/**
 * Created by hao on 17-6-2.
 */
public class Run {
    public static void main(String[] args) {
        String lock=new String("");
        P p=new P(lock);
        C c=new C(lock);

        ThreadP threadP=new ThreadP(p);
        ThreadC threadC=new ThreadC(c);

        threadP.start();
        threadC.start();
    }
}
