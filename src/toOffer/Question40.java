package toOffer;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question40 {
    //数组中只出现一次的两个数字，其他数字均成对出现
    public static int getSignBit(int data){  //获取传入参数的由最低为开始，
        // 第一位不为零的标志数字
        int sign=1;
        while((sign&data)==0){
            sign<<=1;
        }
        return sign;
    }
    public static int[] solve(int intArr[]){
        int intArrLen=intArr.length;
        int tempResult=intArr[0];
        for(int i=1;i<intArrLen;i++){
            tempResult^=intArr[i];
        }
        if(tempResult==0){
            System.out.println("no such two numbers");
            return null;
        }
        int sign=getSignBit(tempResult);  //按照标志位将数组分为两个部分，分别寻找
        int []res={0,0};  //0异或任何数字均为数字本身
        for(int i=0;i<intArrLen;i++){
            if((sign&intArr[i])!=0){
                res[0]^=intArr[i];
            }else
                res[1]^=intArr[i];
        }
        return res;
    }
}
