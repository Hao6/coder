package com.leetcoder;

/**
 * Created by hao on 17-6-10.
 */
public class Solution29 {
    public int divide(int dividend, int divisor) {
        int ret = 0;
        int sign = dividend ^ divisor;
        int mark;
        if (sign < 0) {
            mark = -1;
        } else if (sign > 0) {
            mark = 1;
        } else {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        int lower, higher, temp;
        for (int i = 1; i < 32; i++) {
            if ((divisor ^ (divisor << i)) < 0) {
                lower = i - 1;
                higher = i - 1;   //higher==lower表示如果左移i位，将导致divisor溢出
                break;
            } else {
                if (mark == 1) {
                    temp = dividend - (divisor << i);
                } else {
                    temp = dividend + (divisor << i);
                }
                if (temp == 0) {
                    return mark * (divisor << (i - 1));
                } else if ((temp ^ dividend) < 0) {
                    lower = i - 1;
                    higher = i;
                    break;
                }
            }
        }
        //[divisor<<i,divisor<<j]即是二分查找的区间，步长是divisor,i<j
        //[divisor<<i,Integer.MAX_VALUE] || [Integer.MIN_VALUE,divisor<<i]

        return ret;
    }
}
