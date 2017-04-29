package com.leetcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/29.
 */
public class Solution386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ret = new ArrayList<>();
        if (n <= 0)
            return ret;
        addNum(n, 1, ret);   //递归调用
        return ret;
    }

    public void addNum(int n, int curData, List<Integer> dataList) {
        if (curData > n)
            return;
        else {
            dataList.add(curData);
            for(int i=1;i<10;i++){
                if(n/10>=curData){
                    addNum(n,curData*10,dataList);
                }
                else if(n/10<(curData+i) && n>=curData+i){
                    dataList.add(curData+i);
                    continue;
                }
                if(n>=curData+i){
                    addNum(n,curData+i,dataList);
                }
            }
        }
    }
}
