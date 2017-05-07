package com.Patterns.Design.responsibilityChain;

/**
 * Created by hao on 17-5-3.
 */
public abstract class AbstractRequest {
    public Level requestLevel;
    public String content;
    public AbstractRequest(String content){
        this.content=content;
    }
    public abstract Level getRequestLevel();
}
