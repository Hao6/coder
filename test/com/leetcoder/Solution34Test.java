package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-5-8.
 */
public class Solution34Test extends TestCase {
    Solution34 s34;
    int array[];
    int target;
    public void setUp() throws Exception {
        super.setUp();
        s34=new Solution34();
        array=new int[]{5, 7, 7, 8, 8, 10};
        target=8;
    }

    public void testSearchRange() throws Exception {
        int []ret=s34.searchRange(array,target);
        assertEquals(ret[0],3);
        assertEquals(ret[1],4);

    }

    public void testSearchLower() throws Exception {
        assertEquals(3,s34.searchLower(array,target,0,array.length-1));

    }

    public void testSearchHigher() throws Exception {
        assertEquals(4,s34.searchHigher(array,target,0,array.length-1));
    }

}