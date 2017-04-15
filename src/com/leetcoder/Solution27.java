package com.leetcoder;

/**
 * Created by hongji on 2017/4/15.
 */
public class Solution27 {
    public int removeElement(int[] nums, int val) {
        int numsLen=nums.length;
        if(numsLen==0)
            return numsLen;
        int curData=val;
        int curCount=0;
        int ret=numsLen;
        for(int i=0;i<numsLen;i++){
            if(nums[i]==curData){
                curCount++;
            }else{
                if(curCount!=0){
                    for(int j=i-curCount;j<numsLen-curCount;j++){
                        nums[j]=nums[j+curCount];
                    }
                    ret-=curCount;
                    numsLen-=curCount;
                    i-=curCount;
                    curCount=0;
                }
            }
        }
        return ret-curCount;
    }
}
