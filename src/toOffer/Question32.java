package toOffer;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question32 {
    //在[1,n]上，数字1出现在数值各位上的次数之和，其中n为整数
    public static int solve(int n){
        assert (n>=1);
        int countOfOne=0;
        String data="0".concat(String.valueOf(n));  //将整数转换为字符串
        int dataLen=data.length();
        int higherBitsNum;
        int lowerBitsNum;
        int curBitNum;
        for(int i=1;i<dataLen;i++){
            higherBitsNum=Integer.valueOf(data.substring(0,i));
            if(i+1>=dataLen){
                lowerBitsNum=0;
            }else {
                lowerBitsNum = Integer.valueOf(data.substring(i + 1, dataLen));
            }
            curBitNum=Integer.valueOf(data.substring(i,i+1));
            if(curBitNum>1){
                countOfOne+=(higherBitsNum+1)*(int)Math.pow(10,dataLen-i-1);
            }else if(curBitNum==1){
                countOfOne+=higherBitsNum*(int)Math.pow(10,dataLen-i-1)+lowerBitsNum+1;
            }else if(curBitNum==0){
                countOfOne+=higherBitsNum*(int)Math.pow(10,dataLen-i-1);
            }
        }
        return countOfOne;
    }
}
