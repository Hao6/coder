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
        needle = "abaabcaba";
        haystack="w";
    }

    public void testStrStr() throws Exception {
        assertEquals(-1,s28.strStr(haystack,needle));
    }

    public void testFail() throws Exception {
        int[] fail = s28.fail(needle);
        int[] fail1 = s28.fail1(needle);
        for (int i = 0; i < fail.length; i++) {
            assertEquals(fail[i], fail1[i]);
        }
    }

}