package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-10.
 */
public class Solution29Test extends TestCase {
    int dividend;
    int divisor;
    Solution29 s29;

    public void setUp() throws Exception {
        super.setUp();
        s29 = new Solution29();
        dividend = -5;
        divisor = 9;
    }

    public void testDivide() throws Exception {
//        System.out.println(dividend);
//        System.out.println(dividend/divisor);  //java的除法操作不会因为溢出而抛出异常
//        System.out.println(Math.abs(dividend));
//        System.out.println(divisor<<2);
//        System.out.println(dividend>>1);
        s29.divide(dividend, divisor);
    }

}