package com.leetcoder;

import junit.framework.TestCase;

import java.util.LinkedList;

/**
 * Created by hao on 17-6-12.
 */
public class MinStackTest extends TestCase {
    MinStack minStack;

    public void setUp() throws Exception {
        super.setUp();
        minStack = new MinStack();
    }

    public void testAll() throws Exception {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
//        minStack.getMin();   //--> Returns -3.
        System.out.println(minStack.getMin());
        minStack.pop();
//        minStack.top();      //--> Returns 0.
        System.out.println(minStack.top());
//        minStack.getMin();   //--> Returns -2.
        System.out.println(minStack.getMin());
    }

}