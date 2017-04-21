package com.leetcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/19.
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret=new ArrayList<>();

        for(int i=0;i<numRows;i++){
            List<Integer> help=new ArrayList<>();
            help.add(1);
            for(int j=1;j<i;j++){
                help.add(ret.get(i-1).get(j-1)+ret.get(i-1).get(j));
            }
            if(i!=0){
                help.add(1);
            }
            ret.add(help);
        }
        return ret;
    }
}
