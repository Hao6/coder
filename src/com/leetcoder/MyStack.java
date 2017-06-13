package com.leetcoder;

import java.util.LinkedList;

/**
 * Created by hao on 17-6-12.
 */
public class MyStack {
    /**
     * Initialize your data structure here.
     */
    private LinkedList<Integer> mainQueue;
    private LinkedList<Integer> helpQueue;
    private int count;          //count==1时，help对外开放，==0时，main对外开放

    public MyStack() {
        mainQueue = new LinkedList<>();
        helpQueue = new LinkedList<>();
        count = 1;
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        if (count == 1) {
            helpQueue.add(x);
        } else {
            mainQueue.add(x);
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {  //每次pop后，将count更新
        int ret = 0;
        if (count == 1) {
            while (helpQueue.size() > 1) {
                int tempData = helpQueue.pollFirst();
                mainQueue.add(tempData);
            }

            ret = helpQueue.pollFirst();
            count = 0;
        } else {
            while (mainQueue.size() > 1) {
                int tempData = mainQueue.pollFirst();
                helpQueue.add(tempData);
            }

            ret = mainQueue.pollFirst();
            count = 1;
        }
        return ret;
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (count == 1) {
            return helpQueue.peekLast();
        } else {
            return mainQueue.peekLast();
        }
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (count == 1) {
            return helpQueue.isEmpty();
        } else {
            return mainQueue.isEmpty();
        }
    }
}
