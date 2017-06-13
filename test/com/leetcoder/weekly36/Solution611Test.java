package com.leetcoder.weekly36;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-13.
 */
public class Solution611Test extends TestCase {
    int[] nums;
    Solution611 s611;

    public void setUp() throws Exception {
        super.setUp();
        s611 = new Solution611();
        nums = new int[]{2, 3, 4};
    }

    public void testTriangleNumber() throws Exception {
        assertEquals(1, s611.triangleNumber(nums));
    }

}