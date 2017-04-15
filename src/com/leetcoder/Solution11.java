package com.leetcoder;

/**
 * Created by hongji on 2017/4/11.
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int tempSum=0;
        int maxSum=0;
        while(i<j){
            if(height[i]<=height[j]){
                tempSum=(j-i)*height[i];
                i++;
            }else{
                tempSum=(j-i)*height[j];
                j--;
            }
           if(maxSum<tempSum){
                maxSum=tempSum;
           }
        }
        return maxSum;
    }
}
