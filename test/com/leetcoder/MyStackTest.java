package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-12.
 */
public class MyStackTest extends TestCase {
    MyStack myStack;

    public void setUp() throws Exception {
        super.setUp();
        myStack = new MyStack();
    }

    public void testAll() throws Exception {
        myStack.push(1);
        System.out.println(myStack.empty());

        myStack.push(2);
        System.out.println(myStack.empty());

        System.out.println(myStack.pop());
        System.out.println(myStack.empty());

        System.out.println(myStack.top());
        System.out.println(myStack.empty());

        myStack.push(3);
        System.out.println(myStack.empty());

        System.out.println(myStack.pop());
        System.out.println(myStack.empty());

        System.out.println(myStack.pop());
        System.out.println(myStack.empty());

    }

}