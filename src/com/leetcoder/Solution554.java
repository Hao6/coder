package com.leetcoder;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by hongji on 2017/4/19.
 */
public class Solution554 {
    public int leastBricks(List<List<Integer>> wall) {
        int ret = 0;
        int tempSum = 0;
        int temp;
        int wallLength = -1;   //墙的宽度
        int wallNum = wall.size();  //墙的数量
        HashMap<Integer, Integer> help = new HashMap<>();
        for (List<Integer> aWall : wall) {
            tempSum = 0;
            for (int data : aWall) {
                tempSum += data;
                if (help.containsKey(tempSum)) {
                    temp = help.get(tempSum);
                    help.put(tempSum, temp + 1);
                } else {
                    help.put(tempSum, 1);
                }
            }
            if (wallLength < 0) {
                wallLength = tempSum;
            }
        }

        Iterator it = help.entrySet().iterator();
        int key,val;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            key =(int) entry.getKey();
            val = (int)entry.getValue();
            if(key!=wallLength && val>ret){
                ret=val;
            }
        }
        return wallNum-ret;
    }
}
