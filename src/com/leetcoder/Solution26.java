package com.leetcoder;

/**
 * Created by hongji on 2017/4/15.
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int numsLen=nums.length;
        if(numsLen==0 || numsLen==1)
            return numsLen;
        int curData=nums[0];
        int curCount=0;
        int ret=numsLen;
        int i;
        for( i=1;i<numsLen;i++){
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
                curData=nums[i];
            }
        }
        return ret-curCount;
    }
}
