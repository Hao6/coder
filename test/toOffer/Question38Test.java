package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question38Test extends TestCase {
    Integer intArr[];
    public void setUp() throws Exception {
        super.setUp();
        intArr=new Integer[]{1,1,2,3,3,3,4,4,5,7,8};
    }

    public void testSolve() throws Exception {
        assertEquals(3,Question38.solve(intArr,3));
    }

}