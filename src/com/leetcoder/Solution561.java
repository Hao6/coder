package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hao on 17-6-8.
 */
public class Solution561 {
    public int arrayPairSum(int[] nums) {  //贪心法，最大的不能取，则取次大的
        int maxSum=0;
        Arrays.sort(nums);
        int numsLen=nums.length;
        for(int i=0;i<numsLen;i+=2){
            maxSum+=nums[i];
        }
        return maxSum;
    }
}
