package com.multiThread.capter2.synOutAsyn;


/**
 * Created by hongji on 2017/5/29.
 */
public class Test {
    public static void main(String[] args) {
        MyList myList=new MyList();
        MyThreadA myThreadA=new MyThreadA(myList);
        myThreadA.setName("A");
        myThreadA.start();

        MyThreadB myThreadB=new MyThreadB(myList);
        myThreadB.setName("B");
        myThreadB.start();
    }
}
