package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution28Test extends TestCase {
    String haystack;
    String needle;
    Solution28 s28;
    public void setUp() throws Exception {
        super.setUp();
        s28=new Solution28();
        needle="qwe";
        haystack="w";
    }

    public void testStrStr() throws Exception {
        assertEquals(-1,s28.strStr(haystack,needle));
    }

}