package com.multiThread.capter3.stack1;

/**
 * Created by hao on 17-6-3.
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
