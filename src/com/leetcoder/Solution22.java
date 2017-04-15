package com.leetcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/14.
 */
public class Solution22 {
    public List<String> generateParenthesis(int n,List<String> result) {
        if(n<=0)
            return null;
        String head="(";
        String end=")";
        int sign=0;
        R(head,end,sign,n*2,result);
        return result;
    }
    public void R(String headStr,String endStr,int sign,int sum,List<String> list){
        if(sign<-1){
            return;
        }
        if(headStr.length()+endStr.length()==sum) {
            list.add(headStr + endStr);
            return;
        }else if(sign==sum-headStr.length()-endStr.length()){
            for(int i=0;i<sign;i++){
                headStr+=")";
            }
            list.add(headStr + endStr);
            return;
        }else if(sign==headStr.length()+endStr.length()-sum){   //观察这一步在何时起作用
            for(int i=0;i<-sign;i++){
                headStr+="(";
            }
            list.add(headStr + endStr);
            return;
        }

        R(headStr+"(",endStr,sign+1,sum,list);
        R(headStr+")",endStr,sign-1,sum,list);
    }
}
