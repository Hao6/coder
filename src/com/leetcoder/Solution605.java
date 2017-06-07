package com.leetcoder;

/**
 * Created by hao on 17-6-7.
 */
public class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int arrLen=flowerbed.length;
        for(int i=0;i<arrLen;){
            if(flowerbed[i]==0){
                if(i+1<arrLen && flowerbed[i+1]==0 || i+1==arrLen) {
                    n--;
                    i+=2;
                }
                else{
                    i+=3;
                }

            }else{
                i+=2;
            }
            if(n==0)
                return true;
        }
        return false;
    }
}
