package toOffer;

/**
 * Created by hongji on 2017/3/16.
 */
public class Question46 {
    public static int curData=0;
    public static int curSum=0;
    public Question46(){
        ++curData;
        curSum+=curData;
    }
    public static int solve(int n){
        Question46[] q=new Question46[n];
        return curSum;
    }
}
