package com.leetcoder;

import cn.edu.redSkyline.ArrayUnit;
import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/11.
 */
public class Solution31Test extends TestCase {
    Solution31 s31;
    int nums[];
    int numsLen;
    public void setUp() throws Exception {
        super.setUp();
        s31=new Solution31();
        nums=new int[]{1,3,2};
        numsLen=nums.length;
    }

    public void testNextPermutation() throws Exception {
        s31.nextPermutation(nums);
        for(int i=0;i<numsLen;i++){
            System.out.println(nums[i]);
        }
    }

}