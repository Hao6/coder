package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-5-8.
 */
public class Solution35Test extends TestCase {
    Solution35 s35;
    int []array;
    int target;
    public void setUp() throws Exception {
        super.setUp();
        s35=new Solution35();
        array=new int[]{1,3,5,6};
        target=3;
    }

    public void testSearchInsert() throws Exception {
        System.out.println(s35.searchInsert(array,target));
    }
    public void testSearchInsert1() throws Exception {
        for(int i=0;i<8;i++) {
            assertEquals(s35.searchInsert1(array, target), s35.searchInsert(array, target));
        }
    }

}