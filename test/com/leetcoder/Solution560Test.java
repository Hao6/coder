package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-8.
 */
public class Solution560Test extends TestCase {
    int []nums;
    int k;
    Solution560 s560;
    public void setUp() throws Exception {
        super.setUp();
        s560=new Solution560();
        k=4;
        nums=new int[]{1,6,0,5,-1,4,9};
    }

    public void testSubarraySum() throws Exception {
        assertEquals(3,s560.subarraySum(nums,k));
    }

}