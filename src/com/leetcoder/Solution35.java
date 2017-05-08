package com.leetcoder;

import java.util.Arrays;

/**
 * Created by hao on 17-5-8.
 */
public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int ret;
        ret= Arrays.binarySearch(nums,target);
        if(ret<0){
            ret=-ret-1;
        }
        return ret;
    }
    public int searchInsert1(int[] nums, int target) {
        int numsLen=nums.length;
        int i=0,j=numsLen-1,middle;
        while(i<=j){
            middle=i+(j-i)/2;
            if(nums[middle]<target){
                i=middle+1;
            }else if(nums[middle]>target){
                j=middle-1;
            }else{
                if(middle-1>=0 && nums[middle-1]==target){
                    j=middle-1;
                }else{
                    return middle;
                }
            }
        }
        return j+1;
    }
}
