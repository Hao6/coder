package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/15.
 */
public class Solution26Test extends TestCase {
    int []array;
    Solution26 s26;
    public void setUp() throws Exception {
        super.setUp();
        s26=new Solution26();
        array=new int[]{1,1,1,2,3,4};
    }

    public void testRemoveDuplicates() throws Exception {
        assertEquals(4,s26.removeDuplicates(array));
        for(int i=0;i<4;i++){
            System.out.println(array[i]);
        }
    }

}