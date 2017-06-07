package com.leetcoder;

/**
 * Created by hao on 17-6-8.
 */
public class Solution566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows=nums.length;
        int columns=nums[0].length;
        if(rows*columns!=r*c){
            return nums;
        }
        int [][]newNums=new int[r][c];
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                newNums[i+j/c][i+j%c]=nums[i][j];
            }
        }
        return newNums;
    }
}
