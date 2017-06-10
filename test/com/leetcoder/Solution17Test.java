package com.leetcoder;

import junit.framework.TestCase;

import java.util.Collections;
import java.util.List;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution17Test extends TestCase {
    String digits;
    Solution17 s17;
    public void setUp() throws Exception {
        super.setUp();
        s17=new Solution17();
        digits="";
    }

    public void testLetterCombinations() throws Exception {
        List<String> ret=s17.letterCombinations(digits);
        System.out.println(ret);
    }

}