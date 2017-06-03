package com.multiThread.capter3.stack1;

/**
 * Created by hao on 17-6-3.
 */
public class Run {
    public static void main(String[] args) {
        MyStack myStack=new MyStack();
        P p=new P(myStack);
        P p1=new P(myStack);
        P p2=new P(myStack);
        P p3=new P(myStack);
        P p4=new P(myStack);
        P p5=new P(myStack);


        C c=new C(myStack);
        C c1=new C(myStack);
        C c2=new C(myStack);
        C c3=new C(myStack);
        C c4=new C(myStack);

        ThreadP threadP=new ThreadP(p);
        ThreadP threadP1=new ThreadP(p1);
        ThreadP threadP2=new ThreadP(p2);
        ThreadP threadP3=new ThreadP(p3);
        ThreadP threadP4=new ThreadP(p4);
        ThreadP threadP5=new ThreadP(p5);

        ThreadC threadC=new ThreadC(c);
        ThreadC threadC1=new ThreadC(c1);
        ThreadC threadC2=new ThreadC(c2);
        ThreadC threadC3=new ThreadC(c3);
        ThreadC threadC4=new ThreadC(c4);

        threadP.start();
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();

        threadC.start();
        threadC1.start();
        threadC2.start();
        threadC3.start();
        threadC4.start();

    }
}
