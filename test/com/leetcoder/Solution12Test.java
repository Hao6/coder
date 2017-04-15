package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/9.
 */
public class Solution12Test extends TestCase {
    Solution12 s12;
    Solution13 s13;
    public void setUp() throws Exception {
        super.setUp();
        s12=new Solution12();
        s13=new Solution13();
    }

    public void testIntToRoman() throws Exception {
        String tempStr;
        for(int i=1;i<20;i++){
            tempStr=s12.intToRoman(i);
            System.out.println(tempStr);
            assertEquals(i,s13.romanToInt(tempStr));
        }
        //System.out.println(s12.intToRoman(11));
    }

}