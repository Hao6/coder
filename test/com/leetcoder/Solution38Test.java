package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/6/14.
 */
public class Solution38Test extends TestCase {
    int n;
    Solution38 s38;
    public void setUp() throws Exception {
        super.setUp();
        s38=new Solution38();
        n=7;
    }

    public void testCountAndSay() throws Exception {
        assertEquals("13112221",s38.countAndSay(n));
    }

}