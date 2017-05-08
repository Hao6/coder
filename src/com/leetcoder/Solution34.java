package com.leetcoder;

/**
 * Created by hao on 17-5-8.
 */
public class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int numsLen=nums.length;
        int []ret=new int[2];
        if(numsLen==0){
            ret[0]=-1;
            ret[1]=-1;
            return ret;
        }
        ret[0]=searchLower(nums,target,0,numsLen-1);
        if(ret[0]==-1) {
            ret[1] = -1;
            return ret;
        }else{
            ret[1]=searchHigher(nums,target,ret[0],numsLen-1);
            return ret;
        }
    }

    public int searchLower(int []nums,int target,int lower,int higher){
        int i=lower,j=higher,middle;
        while(i<=j){
            middle=i+(j-i)/2;
            if(nums[middle]<target){
                i=middle+1;
            }else if(nums[middle]>target){
                j=middle-1;
            }else{
                if(middle-1>=lower && nums[middle-1]==target){
                    j=middle-1;
                }else{
                    return middle;
                }
            }
        }
        return -1;
    }
    public int searchHigher(int []nums,int target,int lower,int higher){
        int i=lower,j=higher,middle;
        while(i<=j){
            middle=i+(j-i)/2;
            if(nums[middle]<target){
                i=middle+1;

            }else if(nums[middle]>target){
                j=middle-1;

            }else{
                if(middle+1<=higher && nums[middle+1]==target){
                    i=middle+1;
                }else{
                    return middle;
                }
            }
        }
        return -1;
    }
}
