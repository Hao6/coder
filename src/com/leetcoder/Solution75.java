package com.leetcoder;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution75 {
    public void sortColors(int[] nums) {
        if(nums==null)
            throw new RuntimeException();
        int numsLen=nums.length;
        if(numsLen==0 || numsLen==1)
            return;
        //第一步，将所有的0元素移动到数组的最前端
        int demarcation=swapData(nums,0,numsLen,0);
        swapData(nums,demarcation,numsLen,1);
    }
    private int swapData(int []nums,int beginIndex,int endIndex,int refer){
        int i=beginIndex;
        int j=endIndex-1;
        int temp=0;
        while(i<j){
            while(i<endIndex){
                if(nums[i]==refer)
                    i++;
                else
                    break;
            }
            while(j>=i){
                if(nums[j]>refer)
                    j--;
                else
                    break;
            }
            if(i<j){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }else{
                break;
            }
        }
        return i;
    }

}
