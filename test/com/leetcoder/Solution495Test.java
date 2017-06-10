package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution495Test extends TestCase {
    int []timeSeries;
    int duration;
    Solution495 s495;
    public void setUp() throws Exception {
        super.setUp();
        s495=new Solution495();
        duration=2;
        timeSeries=new int[]{1,2};
    }

    public void testFindPoisonedDuration() throws Exception {
        assertEquals(3,s495.findPoisonedDuration(timeSeries,duration));
    }

}