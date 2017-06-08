package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-8.
 */
public class Solution561Test extends TestCase {
    int []nums;
    Solution561 s561;
    public void setUp() throws Exception {
        super.setUp();
        s561=new Solution561();
        nums=new int[]{1,4,3,2};
    }

    public void testArrayPairSum() throws Exception {
        assertEquals(4,s561.arrayPairSum(nums));
    }

}