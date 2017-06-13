package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-12.
 */
public class MyQueueTest extends TestCase {
    MyQueue myQueue;

    public void setUp() throws Exception {
        super.setUp();
        myQueue = new MyQueue();
    }

    public void testAll() throws Exception {
        myQueue.push(1);
        System.out.println(myQueue.empty());

        myQueue.push(2);
        System.out.println(myQueue.empty());

        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());

        System.out.println(myQueue.peek());
        System.out.println(myQueue.empty());

        myQueue.push(3);
        System.out.println(myQueue.empty());

        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());

        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

}