package com.leetcoder;

import junit.framework.TestCase;

public class Solution8Test extends TestCase {
    String str,str1,str2,str3,str4,str5;
    Solution8 s;
    public void setUp() throws Exception {
        super.setUp();
        s=new Solution8();
        str=String.valueOf(Integer.MIN_VALUE);
        str1="";
        str2="  -02345io908";
        str3="abc";
        str4="-2147483649";
        str5=" b11228552307";
    }

    public void testMyAtoi() throws Exception {
        //assertEquals(s.myAtoi(str),(int)Integer.valueOf(str));
        assertEquals(s.myAtoi(str1),0);
        assertEquals(s.myAtoi(str2),-2345);
        assertEquals(s.myAtoi(str3),0);
        assertEquals(s.myAtoi(str4),Integer.MIN_VALUE);
        assertEquals(s.myAtoi(str5),0);




    }

}