package com.leetcoder;

import java.util.LinkedList;

/**
 * Created by hao on 17-6-12.
 */
public class MinStack {
    /**
     * initialize your data structure here.
     */
    LinkedList<Integer> minStack;
    LinkedList<Integer> helpStack;

    public MinStack() {
        minStack = new LinkedList<>();
        helpStack = new LinkedList<>();
    }

    public void push(int x) {
        minStack.add(x);
        if (!helpStack.isEmpty()) {
            int minData = helpStack.getLast();
            if (x < minData) {
                helpStack.add(x);
            } else {
                helpStack.add(minData);
            }
        } else {
            helpStack.add(x);
        }
    }

    public void pop() {
        minStack.pollLast();
        helpStack.pollLast();
    }

    public int top() {
        return minStack.getLast();
    }

    public int getMin() {
        return helpStack.getLast();
    }
}
