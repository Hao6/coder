package com.leetcoder;

/**
 * Created by hongji on 2017/6/14.
 */
public class Solution38 {
    public String countAndSay(int n) {
        StringBuilder initStr=new StringBuilder("1");
        StringBuilder retStr=new StringBuilder();
        int strLen=0;
        int initChar='0';
        int curCount=0;
        for(int i=1;i<=n;i++){
            strLen=initStr.length();
            initChar=initStr.charAt(0);
            for(int j=0;j<strLen;j++){
                if(initStr.charAt(j)!=initChar && j!=strLen-1){
                    retStr.append(curCount);
                    retStr.append(initChar-'0');
                    curCount=0;
                    initChar=initStr.charAt(j);
                }else if(j==strLen-1){
                    if(initChar==initStr.charAt(j) ) {
                        retStr.append(curCount + 1);
                        retStr.append(initChar - '0');
                    }else {
                        retStr.append(curCount);
                        retStr.append(initChar - '0');
                        retStr.append(1);
                        retStr.append(initStr.charAt(j)-'0');
                    }
                }else{
                    curCount++;
                }
            }
            initStr=retStr;
            retStr=new StringBuilder();
            curCount=0;
        }
        return retStr.toString();
    }
}
