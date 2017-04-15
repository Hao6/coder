package cn.edu.redSkyline;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/12.
 */
public class StringUnitTest extends TestCase {
    public void testCharCount() throws Exception {
        String str="wwwe1273 84uir";
        char target=' ';
        assertEquals(StringUnit.charCount(str,target),1);
    }

}