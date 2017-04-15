package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public abstract class IntGenerator {
    private volatile boolean canceled=false;
    public abstract int next();
    public void cancel(){
        canceled=true;
    }
    public boolean isCanceled(){
        return canceled;
    }
}
