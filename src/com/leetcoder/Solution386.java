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
        for(int i=0;i<=9;i++){
            if(curData+i<=n && !(i==9 && curData==1)){
                dataList.add(curData+i);
            }else{
                return;
            }
            addNum(n,(curData+i)*10,dataList);
        }
    }
}
