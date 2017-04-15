package com.leetcoder;


public class Solution8 {
    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        int strLen = str.length();
        int validLen = 0; //数值位长度
        int validIndex = 0;  //有效下标
        if (strLen == 0) {
            return 0;
        }
        String validSet = "0123456789+-";  //有效字符集合
        String numberSet = "0123456789";
        String whiteSpaceSet="   "; //空格与Tab
        //String numberSetNoZero="123456789";
        int i;
        for (i = 0; i < strLen; i++) {
            if (validSet.contains(String.valueOf(str.charAt(i))) == true)
                break;
            if(whiteSpaceSet.contains(String.valueOf(str.charAt(i))) == false)
                return 0;
        }
        if(i==strLen)
            return 0;
        validIndex = i;
        char firstChar = str.charAt(validIndex);
        int sign = -1;
        if (firstChar == '+' || firstChar == '0') {
            sign = 0;
            validIndex += 1;
        } else if (firstChar == '-') {
            sign = 1;
            validIndex += 1;
        } else if (numberSet.contains(String.valueOf(firstChar)) == true) {  //'[1,9]'
            sign = 0;
        } else {
            return 0;
        }
        for (i = validIndex; i < strLen; i++) {
            if (numberSet.contains(String.valueOf(str.charAt(i))) == false) {
                break;
            }
        }
        String tempStr = str.substring(validIndex, i);
        return litterProcessor(tempStr, sign);
    }
    private int litterProcessor(String sourStr, int sign) { //只接受完全简单的字符串，内部方法
        String INT_MAX=String.valueOf(Integer.MAX_VALUE);
        String INT_MIN=String.valueOf(Integer.MIN_VALUE).substring(1);
        if (sign == 0 && (sourStr.length() > INT_MAX.length() ||
                sourStr.length() == INT_MAX.length() && sourStr.compareTo(INT_MAX) > 0)) {
            return Integer.MAX_VALUE;  //正溢出
        } else if (sign == 1 && (sourStr.length() > INT_MIN.length() ||
                sourStr.length() == INT_MIN.length() && sourStr.compareTo(INT_MIN) > 0)) {
            return Integer.MIN_VALUE;   //负溢出
        }
        int sourLen = sourStr.length() - 1;
        int sum = 0;
        for (int i = sourLen; i >= 0; i--) {
            int curNum = (sourStr.charAt(i) - '0');
            for (int j = i; j < sourLen; j++) {
                curNum *= 10;
            }
            sum += curNum;
        }
        return sign == 0 ? sum : -sum;
    }
}
