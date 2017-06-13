package com.leetcoder;

import java.util.LinkedList;

/**
 * Created by hao on 17-6-12.
 */
public class MyQueue {
    /**
     * Initialize your data structure here.
     */
    private LinkedList<Integer> mainStack;
    private LinkedList<Integer> helpStack;
    private int sign;

    public MyQueue() {
        mainStack = new LinkedList<>();
        helpStack = new LinkedList<>();
        sign = 1;
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        if (sign == 0) {
            while (!helpStack.isEmpty()) {
                int tempData = helpStack.pollLast();
                mainStack.add(tempData);
            }
            sign = 1;
        }
        mainStack.add(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (sign == 1) {
            while (!mainStack.isEmpty()) {
                int tempData = mainStack.pollLast();
                helpStack.add(tempData);
            }
            sign = 0;
        }
        return helpStack.pollLast();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (sign == 1) {
            while (!mainStack.isEmpty()) {
                int tempData = mainStack.pollLast();
                helpStack.add(tempData);
            }
            sign = 0;
        }
        return helpStack.peekLast();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        if (sign == 1) {
            return mainStack.isEmpty();
        } else {
            return helpStack.isEmpty();
        }
    }
}
