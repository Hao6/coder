package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hongji on 2017/4/21.
 */
public class Solution16 {
    public int threeSumClosest(int[] nums, int target) {

        int ret = nums[0]+nums[1]+nums[2];
        int tempDis=Math.abs(ret-target);

        int numsLen = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < numsLen-2; i++) {
            int j = i + 1, z = numsLen - 1;

            int tempData=nums[i]+nums[z]+nums[j];
            int distance=Math.abs(tempData-target);
            while (j < z) {
                if(nums[i]+nums[j]+nums[z]==target)
                    return target;
                else if(nums[i]+nums[j]+nums[z]<target){
                    int dis1=Math.abs(nums[i]+nums[j]+nums[z]-target);
                    if(distance>=dis1){
                        distance=dis1;
                        tempData=nums[i]+nums[j]+nums[z];
                    }
                    j++;
                }else{
                    int dis1=Math.abs(nums[i]+nums[j]+nums[z]-target);
                    if(distance>=dis1){
                        distance=dis1;
                        tempData=nums[i]+nums[j]+nums[z];
                    }
                    z--;
                }
            }
           if(tempDis>distance){
               ret=tempData;
               tempDis=distance;
           }
        }
        return ret;
    }
}
