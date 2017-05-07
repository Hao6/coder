package com.Patterns.Design.responsibilityChain;

/**
 * Created by hao on 17-5-3.
 */
public class Handle0 extends AbstractHandle implements GetOrSet {

    public void set(Level level){
        this.handleLevel=level;
    }
    public void handle(AbstractRequest request){
        System.out.println("Handle0 "+"处理了"+request );
    }
    public  Level getHandleLevel(){
        return handleLevel;
    }
}
