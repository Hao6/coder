package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/15.
 */
public class Solution27Test extends TestCase {
    int []array;
    Solution27 s27;
    public void setUp() throws Exception {
        super.setUp();
        s27=new Solution27();
        array=new int[]{3,2,2,3,5};
    }

    public void testRemoveElement() throws Exception {
        assertEquals(3,s27.removeElement(array,3));
        for(int i=0;i<3;i++){
            System.out.println(array[i]);
        }
    }

}