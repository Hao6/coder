package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/21.
 */
public class Solution16Test extends TestCase {
    int []nums;
    int target;
    Solution16 s16;
    public void setUp() throws Exception {
        super.setUp();
        s16=new Solution16();
        nums=new int[]{-55,-11,-7,-3,4,5,6,9,11,23,33};
        target=1;
    }

    public void testThreeSumClosest() throws Exception {
        System.out.println(s16.threeSumClosest(nums,target));
    }

}