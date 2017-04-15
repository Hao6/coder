package com.leetcoder;

/**
 * Created by hongji on 2017/4/8.
 */
//将罗马数字转换为int,范围是【1，3999】，不考虑非法的罗马数字，不考虑横线的用法
public class Solution13 {
    public int romanToInt(String s) {
        String basicCharSet="IVXLCDM";
        String litterCharSet="IXC";
        int []array={1,5,10,50,100,500,1000};
        int ret=0;
        int sLen=s.length();
        if(sLen==1){    //单个字符
            ret=array[basicCharSet.indexOf(s)];
        }
        else {//至少两位
            int i=0;
            for (i= 0; i < sLen - 1; i++) {
                if(compareChars(s.charAt(i),s.charAt(i + 1))>=0){
                    ret+=array[basicCharSet.indexOf(s.charAt(i))];
                    continue;
                }else{   //s.charAt(i) < s.charAt(i + 1)
                    if(litterCharSet.contains(String.valueOf(s.charAt(i)))==true){
                        ret+=array[basicCharSet.indexOf(s.charAt(i+1))]-
                                array[basicCharSet.indexOf(s.charAt(i))];
                        i++;
                        continue;
                    }
                }
            }
            if(i==sLen - 1){
                ret+=array[basicCharSet.indexOf(s.charAt(i))];
            }
        }
        return ret;
    }
    public int compareChars(char c0,char c1){
        String basicCharSet="IVXLCDM";
        int i0=basicCharSet.indexOf(c0);
        int i1=basicCharSet.indexOf(c1);
        if(i0>i1)
            return 1;
        else if(i0<i1){
            return -1;
        }
        else
            return 0;
    }
}
