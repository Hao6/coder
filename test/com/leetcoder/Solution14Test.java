package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/8.
 */
public class Solution14Test extends TestCase {
    String strs[];
    Solution14 s14;
    public void setUp() throws Exception {
        super.setUp();
        s14=new Solution14();
        strs = new String[]{"aa", "a"};
    }

    public void testLongestCommonPrefix() throws Exception {
        assertEquals("",s14.longestCommonPrefix(strs));
    }
    public void testLongestCommonPrefix1() throws Exception {
        assertEquals("a",s14.longestCommonPrefix1(strs));
    }

}