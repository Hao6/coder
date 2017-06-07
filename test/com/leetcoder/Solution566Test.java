package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-8.
 */
public class Solution566Test extends TestCase {
    int [][]nums;
    int r,c;
    Solution566 s566;
    public void setUp() throws Exception {
        super.setUp();
        s566=new Solution566();
        nums=new int[][]{{1,2,3},{4,5,6}};
        r=3;
        c=2;
    }

    public void testMatrixReshape() throws Exception {
        int [][] ret=s566.matrixReshape(nums,r,c);
        for (int[] tempArr : ret){
            for(int temp : tempArr){
                System.out.println(temp);
            }
            System.out.println();
        }
    }

}