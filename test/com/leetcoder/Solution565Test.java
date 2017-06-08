package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-8.
 */
public class Solution565Test extends TestCase {
    int[] nums;
    Solution565 s565;
    public void setUp() throws Exception {
        super.setUp();
        s565=new Solution565();
        nums=new int[]{5,4,0,3,1,6,2};
    }

    public void testArrayNesting() throws Exception {
        assertEquals(4,s565.arrayNesting(nums));
    }

}