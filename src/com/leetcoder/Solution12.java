package com.leetcoder;

import java.util.HashMap;

/**
 * Created by hongji on 2017/4/9.
 */

public class Solution12 {
    public String intToRoman(int num) {
        HashMap<Integer, String> help = new HashMap<>();
        int[] intArr = {1, 5, 10, 50, 100, 500, 1000,
                4, 9, 40, 90, 400, 900};
        String[] strArr = {"I", "V", "X", "L", "C", "D", "M",
                "IV", "IX", "XL", "XC", "CD", "CM"};
        int array[] = {1, 10, 100};
        int array1[]={5,50,500};
        StringBuilder ret = new StringBuilder();
        int temp=num/1000;
        for(int i=0;i<temp;i++){
            ret.append("M");
        }
        num-=temp*1000;  //百位数或者零
        if(num==0)
            return String.valueOf(ret);
        //num在【1，999】之间
        int intArrLen = intArr.length;
        int quotient = 0;   //临时商
        for (int i = 0; i < intArrLen; i++) {   //初始化哈希表
            help.put(intArr[i], strArr[i]);
        }
        int tempData=0,z=2;
        for (int i = 2; i>=0;) {
            if(num<array[i]){
                z--;
                i=z;
                continue;
            }
            if (help.containsKey(num) == true) {
                ret.append(help.get(num));
                break;
            } else {
                if(num>9*array[z] || num<5*array[z] && num>array[z]){
                    tempData=array[z];
                }else if(num>5*array[z]){
                    tempData=array1[z];
                }
                quotient = num / tempData;
                if (help.containsKey(quotient * tempData) == true) {
                    ret.append(help.get(quotient * tempData));
                } else {
                    for (int j = 0; j < quotient; j++) {
                        ret.append(help.get(tempData));
                    }
                }
                num -= quotient * tempData;
            }
        }
        return String.valueOf(ret);
    }

}
