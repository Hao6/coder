package com.leetcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by hao on 17-6-8.
 */
public class Solution565 {
    public int arrayNesting(int[] nums) {
        int ret=0;
        Set<Integer> numSet=new HashSet<>();  //用数组标记会更快
        int numsLen=nums.length;
        for(int i=0;i<numsLen;i++){
            int tempNum=0,k=0;
            if(numSet.contains(nums[i])==false){
                tempNum++;
                numSet.add(nums[i]);
                k=nums[i];
                while(!numSet.contains(nums[k])){
                    tempNum++;
                    numSet.add(nums[i]);
                    k=nums[k];
                }
                if(tempNum>ret) {
                    ret = tempNum;
                }
                if(ret>(numsLen/2))
                    break;
            }
        }
        return ret;
    }
}
