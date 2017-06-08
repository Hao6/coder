package com.leetcoder;

/**
 * Created by hao on 17-6-8.
 */
public class Solution560 {
    public int subarraySum(int[] nums, int k) {
        int ret=0;
        int numsLen=nums.length;
        int []help=new int[numsLen];
        for(int i=numsLen-1;i>=0;i--){
            help[i]=nums[i];
            if(help[i]==k){
                ret++;
            }
            for(int j=i-1;j>=0;j--){                 //枚举
                help[j]=help[j+1]+nums[j];
                if(help[j]==k){
                    ret++;
                }
            }
        }
        return ret;
    }
}
