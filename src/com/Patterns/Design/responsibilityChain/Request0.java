package com.Patterns.Design.responsibilityChain;


/**
 * Created by hao on 17-5-3.
 */
public class Request0 extends AbstractRequest implements GetOrSet {
    public Request0(String content){
        super(content);
    }
    public void set(Level level){
        this.requestLevel=level;
    }
    public Level getRequestLevel(){
        return this.requestLevel;
    }
}
