package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/8.
 */
public class Solution13Test extends TestCase {
    String str[],str1[];
    int array[],array1[];
    Solution13 s13;
    public void setUp() throws Exception {
        super.setUp();
//        str=new String[]{"I","II","III","IV","V","VI","VII","VIII","IX","X"};
//        array=new int[]{1,2,3,4,5,6,7,8,9,10};
        str1=new String[]{"XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX","XXI",
                "XXIV","XXV","XXIX","XL"};
        array1=new int[]{11,12,13,14,15,16,17,18,19,20,21,24,25,29,40};
        s13=new Solution13();
    }

    public void testRomanToInt() throws Exception {
//        for(int i=0;i<str1.length;i++){
//            System.out.println(i);
//            assertEquals(array1[i],s13.romanToInt(str1[i]));
//        }
        assertEquals(3586,s13.romanToInt("MMMDLXXXVI"));

    }

    public void testCompareChars() throws Exception {
        assertEquals(1,s13.compareChars('V','I'));
    }
}