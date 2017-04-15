package com.leetcoder;

/**
 * Created by hongji on 2017/4/7.
 */
public class Solution5 {
    public String longestPalindrome(String s) {
        if(s==null)
            return null;
        int sLen=s.length();
        if(sLen==0 || sLen==1){
            return s;  //返回自己
        }
        StringBuilder reverseS=new StringBuilder(); //倒转
        for(int i=sLen-1;i>=0;i--){
            reverseS.append(s.charAt(i));
        }
        int maxLen=0,curBegin=0;
        for(int i=0;i<sLen;i++){
            for(int j=0;j<sLen;j++){
                if(s.charAt(j)==reverseS.charAt(i)){
                    if((sLen-i-1)-j+1>=maxLen){  //疑似子串长度比已存的要长
                        if(isPalindrome(s,j,sLen-i-1)==true){
                            maxLen=(sLen-i-1)-j+1;
                            curBegin=j;
                        }
                    }else{
                        break;
                    }
                }
            }
        }
        if(maxLen==1){
            return s.substring(0,1);
        }else{
            StringBuilder ret=new StringBuilder();
        for(int i=curBegin;i<curBegin+maxLen;i++){
            ret.append(s.charAt(i));
        }
        return ret.toString();
        }
    }
    private boolean isPalindrome(String str,int i,int j){
        while(j>i){
            if(str.charAt(i++)!=str.charAt(j--)){
                return  false;
            }
        }
        return true;
    }
}
