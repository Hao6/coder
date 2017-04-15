package cn.edu.redSkyline;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/11.
 */
public class DynamicProgrammingTest extends TestCase {
    private char[] charArr0;
    private char[] charArr1;
    private int[] intArr;
    private int[] orderedArr;
    private int replacer;
    public void setUp() throws Exception {
        super.setUp();
        charArr0=new char[]{'a','b','c','d','e','d','c','h','f'};
        charArr1=new char[]{'b','a','b','h','c','d'};
        intArr=new int[]{2,1,5,3,6,4,8,9,7};
        orderedArr=new int[]{1,3,4,8,9};
        replacer=7;
    }

    public void tearDown() throws Exception {

    }

    public void testGetMaxSubSequenceCount() throws Exception {
        assertEquals(4,DynamicProgramming.getMaxSubSequenceCount(charArr0,charArr1));
    }

    public void testGetMaxSubStrCount() throws Exception {
        assertEquals(2,DynamicProgramming.getMaxSubStrCount(charArr0,charArr1));
    }

    public void testGetMaxIncresingSequenceCount() throws Exception {
        assertEquals(5,DynamicProgramming.getMaxIncresingSequenceCount(intArr));
    }

    public void testBinarySearchAndReplace() throws Exception {
        DynamicProgramming.binarySearchAndReplace(orderedArr,orderedArr.length-1,replacer);
        assertEquals(orderedArr[3],replacer);
    }

}