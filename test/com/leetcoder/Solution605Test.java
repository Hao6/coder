package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-7.
 */
public class Solution605Test extends TestCase {
    int [] flowerbed;
    int n;
    Solution605 s605;
    public void setUp() throws Exception {
        super.setUp();
        s605=new Solution605();
        flowerbed=new int[]{1,0,0,0,1,0,0};
        n=2;
    }

    public void testCanPlaceFlowers() throws Exception {
        assertEquals(true,s605.canPlaceFlowers(flowerbed,n));
    }

}