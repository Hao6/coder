package com.leetcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hao on 17-4-20.
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ret=new ArrayList<>();
        int []help=new int[rowIndex+1];  //辅助数组
        Arrays.fill(help,1);
        ret.add(1);
        for(int i=1;i<=rowIndex;i++){
            for(int j=1;j<=rowIndex-i;j++){
                help[j]+=help[j-1];
            }

            ret.add(help[rowIndex-i]);
        }
        return ret;
    }
}
