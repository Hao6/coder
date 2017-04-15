package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question22Test extends TestCase {
    Integer []pushArr;
    Integer []popArr;
    public void setUp() throws Exception {
        super.setUp();
        pushArr=new Integer[]{1,2,3,4,5};
        popArr=new Integer[]{1,2,4,3,5};
    }

    public void testSolve() throws Exception {
        assertEquals(true,Question22.solve(pushArr,popArr));
    }

}