package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/9.
 */
public class Solution24Test extends TestCase {
    Solution24 s24;
    public void setUp() throws Exception {
        super.setUp();
        s24=new Solution24();
    }

    public void testSwapPairs() throws Exception {
        ListNode ret=s24.swapPairs();
        while(ret!=null){
            System.out.println(ret.val);
            ret=ret.next;
        }
    }

}