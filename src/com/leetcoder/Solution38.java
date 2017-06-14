package com.leetcoder;

/**
 * Created by hongji on 2017/6/14.
 */
public class Solution38 {
    public String countAndSay(int n) {
        StringBuilder initStr=new StringBuilder("1");
        StringBuilder helpStr=new StringBuilder();
        for(int i=1;i<n;i++){
            int strLen=initStr.length();
            char curChar=initStr.charAt(0);
            int curIndex=0;
            for(int j=0;j<strLen;j++){
                if(j==strLen-1){
                    if(initStr.charAt(j)==curChar){
                        helpStr.append(j-curIndex+1);
                        helpStr.append(curChar-'0');
                    }else{
                        helpStr.append(j-curIndex);
                        helpStr.append(curChar-'0');
                        helpStr.append(1);
                        helpStr.append(initStr.charAt(j));
                    }
                }else if(initStr.charAt(j)!=curChar){
                        helpStr.append(j-curIndex);
                        helpStr.append(curChar-'0');
                        curChar=initStr.charAt(j);
                        curIndex=j;
                }
            }
            initStr=helpStr;
            helpStr=new StringBuilder();
        }
        return initStr.toString();
    }
}
