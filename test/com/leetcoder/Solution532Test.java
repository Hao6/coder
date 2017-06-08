package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-8.
 */
public class Solution532Test extends TestCase {
    int []nums;
    int k;
    Solution532 s532;
    public void setUp() throws Exception {
        super.setUp();
        s532=new Solution532();
        k=0;
        nums=new int[]{1,1,1,2,3,3,3,5,5,5,7,7,7,8};
    }

    public void testFindPairs() throws Exception {
        assertEquals(4,s532.findPairs(nums,k));
    }

}