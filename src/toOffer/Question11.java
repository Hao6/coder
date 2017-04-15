package toOffer;

/**
 * Created by hongji on 2017/3/21.
 */
//数值的整数次方
public class Question11 {
    public static double solve(double base,int exponent){
        if ((base==0 && exponent<0))//未定义
        {
            return Double.POSITIVE_INFINITY;
        }
        if(base==1)
            return 1;
        if(exponent==0)  //任意数的零次方均为1
            return 1;
        else if(exponent<0)
            return 1/calculate(base,-exponent);
        else
            return calculate(base,exponent);
    }
    public static double calculate(double base,int exponent){
        if(exponent==1)
            return base;
        if(exponent%2==1)
            return base*calculate(base,(exponent-1)/2)*calculate(base,(exponent-1)/2);
        else
            return calculate(base,exponent/2)*calculate(base,exponent/2);
    }
}
