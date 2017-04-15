package toOffer;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question14 {
    //调整数组顺序使奇数位于偶数前面
    public static void solve(IsOneOfAKind []intArr){
        assert (intArr!=null);
        int intArrLen=intArr.length;
        int i=0;
        int j=intArrLen-1;
        while(i<j){
            for(;j>=0;)
                if(intArr[j].isTheKind()==true)
                    j--;
                else
                    break;
            for(;i<intArrLen;)
                if(intArr[i].isTheKind()==false)
                    i++;
                else
                    break;
            if(i>=j)
                break;
            IsOneOfAKind temp=intArr[i];
            intArr[i]=intArr[j];
            intArr[j]=temp;
        }
    }
}
