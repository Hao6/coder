package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/11.
 */
public class Solution557Test extends TestCase {
    String str;
    Solution557 s557;
    public void setUp() throws Exception {
        super.setUp();
        s557=new Solution557();
        str="Let's take LeetCode contest";
    }

    public void testReverseWords() throws Exception {
        System.out.println(s557.reverseWords(str));
    }

}