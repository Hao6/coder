package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution75Test extends TestCase {
    int []nums;
    Solution75 s75;
    public void setUp() throws Exception {
        super.setUp();
        s75=new Solution75();
        nums=new int[]{0,1,2,2,1,2,2,1,0,2,1,0};
    }

    public void testSortColors() throws Exception {
        s75.sortColors(nums);
        for(int i=1;i<nums.length;i++){
            assert(nums[i-1]<=nums[i]);
        }
    }

}