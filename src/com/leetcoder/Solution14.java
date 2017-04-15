package com.leetcoder;

/**
 * Created by hongji on 2017/4/8.
 */
public class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null)
            return "";
        int strsLen=strs.length;
        if(strsLen==0){
            return "";
        }else if(strsLen==1){
            return strs[0];
        }else{
            String shortestStr=null;
            int minLen=0;
            if(strs[0]==null)
                return "";
            int curLen=strs[0].length();
            if(curLen==0)
                return "";
            else {
                shortestStr=strs[0];
                minLen=curLen;
            }
            for(int i=1;i<strsLen;i++){
                if(strs[i]==null)
                    return "";
                curLen=strs[i].length();
                if(curLen==0)
                    return "";
                else{
                    if(minLen>curLen){
                        minLen=curLen;
                        shortestStr=strs[i];
                    }
                }
            }
            int curLong=minLen;
            for(int i=0;i<strsLen;i++){
                int j=0;
                while(j<curLong){
                    if(shortestStr.charAt(j)!=strs[i].charAt(j))
                        break;
                }
                curLong=j;
            }
            return shortestStr.substring(0,curLong);
        }
    }
    public String longestCommonPrefix1(String[] strs) { //leetcode通过版
        int strsLen=strs.length;
        if(strsLen==0){
            return "";
        }else if(strsLen==1){
            return strs[0];
        }else {
            int minLen=strs[0].length();
            String shortestStr=strs[0];
            int j=0,tempLen;
            for(int i=1;i<strsLen;i++){
                j=0;
                tempLen=strs[i].length();
                while(j<minLen && j<tempLen){
                    if(shortestStr.charAt(j)!=strs[i].charAt(j))
                        break;
                    j++;
                }
                minLen=j;
            }
            return shortestStr.substring(0,minLen);
        }
    }
}
