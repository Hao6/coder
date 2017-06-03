package com.multiThread.capter3.stack1;

/**
 * Created by hao on 17-6-3.
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){
        myStack.pop();
    }
}
