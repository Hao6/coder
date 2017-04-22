package com.leetcoder;

import java.util.List;

/**
 * Created by hongji on 2017/4/22.
 */
public class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int ret=0;
        int rows=triangle.size();
        int data0;
        int data1;
        for(int i=1;i<rows;i++){
            List<Integer> temp=triangle.get(i);
            temp.set(0,triangle.get(i-1).get(0)+temp.get(0));
            int tempLen=temp.size();
            for(int j=1;j<tempLen-1;j++){
                data0=triangle.get(i-1).get(j-1);
                data1=triangle.get(i-1).get(j);
                temp.set(j,temp.get(j)+(data0<data1?data0:data1));
            }
            temp.set(tempLen-1,triangle.get(i-1).get(tempLen-2)+temp.get(tempLen-1));
        }
        List<Integer> lastRows=triangle.get(rows-1);
        ret=lastRows.get(0);
        for(int i=1;i<rows;i++){
            if(ret>lastRows.get(i)){
                ret=lastRows.get(i);
            }
        }
        return ret;
    }
}
