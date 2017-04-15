package toOffer;
import static cn.edu.redSkyline.Util.*;

/**
 * Created by hongji on 2017/4/6.
 */
//实现atoi函数,将字符串转换为整数，考虑溢出，正负，最高位非零等情况
public class Question49 {

    //小端的存法，数字的高位放到字符串的低地址处
    public static Integer mainProcessor(String sourStr)throws NumberFormatException{
        if(sourStr==null){
            throw new NumberFormatException("字符串为null");
        }
        int strLen=sourStr.length();
        int validLen=0; //数值位长度
        int validIndex=0;  //有效下标
        if(strLen==0){
            throw new NumberFormatException("字符串为空");

        }
        char firstChar=sourStr.charAt(0);
        int sign=-1;
        if(firstChar=='+'|| firstChar=='0'){
            sign=0;
            validIndex=1;
        }else if(firstChar=='-'){
            sign=1;
            validIndex=1;
        }else if(numberSet.contains(String.valueOf(firstChar))==true){  //'[1,9]'
            sign=0;
            validIndex=0;
        }else{
            throw new NumberFormatException("字符串不合法");

        }
        int i;
        for(i=validIndex;i<strLen;i++){
            if(numberSet.contains(String.valueOf(sourStr.charAt(i)))==false){
                break;
            }
        }
        if(i<strLen){
            throw new NumberFormatException("字符串不合法");
        }else{
            String tempStr=sourStr.substring(validIndex,strLen);
            return litterProcessor(tempStr,sign);
        }

    }
    private static Integer litterProcessor(String sourStr,int sign) { //只接受完全简单的字符串，内部方法
        if(sign==0 &&(sourStr.length()>INT_MAX.length() ||
                sourStr.length()==INT_MAX.length()&& sourStr.compareTo(INT_MAX)>0)){
            throw new NumberFormatException("正溢出");  //正溢出
        }else if(sign==1 && (sourStr.length()>INT_MIN.length() ||
                sourStr.length()==INT_MIN.length() && sourStr.compareTo(INT_MIN)>0)){
            throw new NumberFormatException("负溢出");   //负溢出
        }
        int sourLen=sourStr.length()-1;
        int sum=0;
        for(int i=sourLen;i>=0;i--){
            int curNum=(sourStr.charAt(i) - '0');
            for(int j=i;j<sourLen;j++) {
                curNum *=10;
            }
            sum+=curNum;
        }
        return sign==0?sum:-sum;
    }
}
