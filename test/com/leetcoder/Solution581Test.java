package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-7.
 */
public class Solution581Test extends TestCase {
    int []nums;
    Solution581 s581;
    public void setUp() throws Exception {
        super.setUp();
        s581=new Solution581();
        nums=new int[]{2,  4,6, 8,  9,10, 15};
    }

    public void testFindUnsortedSubarray() throws Exception {
        assertEquals(0,s581.findUnsortedSubarray(nums));
    }

}