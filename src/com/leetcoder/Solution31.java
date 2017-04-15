package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hongji on 2017/4/11.
 */
public class Solution31 {
    public void nextPermutation(int[] nums) {
        int numsLen=nums.length;
        if(numsLen==0 || numsLen==1)
            return;
        int i = 0;
        for (i = numsLen - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }
        if(i==0){   //序列是非递增的，使其反转
            int z=numsLen/2;
            int tempData=0;
            for(int j=0;j<z;j++){
                tempData=nums[j];
                nums[j]=nums[numsLen-1-j];
                nums[numsLen-1-j]=tempData;
            }
            return;
        }else{    //有挽救的可能性
            int tempIndex = i, tempMinIndex = i;
            for (int j = i; j < numsLen; j++) {
                if (nums[j] > nums[i - 1]) {
                    tempIndex = j;
                    if (nums[tempIndex] < nums[tempMinIndex]) {
                        tempMinIndex = tempIndex;
                    }
                }
            }
            int tempData=nums[tempMinIndex];
            nums[tempMinIndex]=nums[i-1];
            nums[i-1]=tempData;
            Arrays.sort(nums,i,numsLen);
            return;
        }
    }
}
