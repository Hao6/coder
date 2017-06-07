package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hao on 17-6-7.
 */
public class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        int numsLen=nums.length;
        int []numsCopy= Arrays.copyOf(nums,numsLen);
        Arrays.sort(numsCopy);
        int ret=0;
        for(int i=0;i<numsLen;i++){
            if(nums[i]==numsCopy[i]){
                ret++;
            }else{
                break;
            }
        }
        if(ret==numsLen || ret==numsLen-1 || ret==numsLen-2)
            return numsLen-ret;
        for(int i=numsLen-1;i>=0;i--){
            if(nums[i]==numsCopy[i]){
                ret++;
            }else{
                break;
            }
        }
        return numsLen-ret;
    }
}
