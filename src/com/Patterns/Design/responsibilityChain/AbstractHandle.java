package com.Patterns.Design.responsibilityChain;

/**
 * Created by hao on 17-5-3.
 */
public abstract class AbstractHandle {
    public Level handleLevel;
    public AbstractHandle nextHandle;

    public  final void requestHandle(AbstractRequest request){
        Level requestLevel=request.getRequestLevel();
        Level handleLevel=this.handleLevel;
        if(requestLevel.compareTo(handleLevel)<=0){
            handle(request);
            return;
        }else{
            this.nextHandle.requestHandle(request);
        }
        System.out.println("没有合适的处理器");
    }

    public void setNextHandle(AbstractHandle nextHandle){
        this.nextHandle=nextHandle;
    }
    public  abstract void handle(AbstractRequest request);
    public abstract Level getHandleLevel();
}
