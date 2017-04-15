package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question29Test extends TestCase {
    Integer intArr[];
    int lower;
    int higher;
    public void setUp() throws Exception {
        super.setUp();
        intArr=new Integer[]{1,2,3,2,1,2,2,2,5,4,2};
        lower=0;
        higher=intArr.length-1;
    }

    public void testSolve() throws Exception {
        assertEquals(2,(int)Question29.solve(intArr));
    }

    public void testSolve1() throws Exception {
        assertEquals(2,(int)Question29.solve1(intArr,lower,higher));
    }

    public void testQuickSorter() throws Exception {
        assertEquals(2,(int)Question29.quickSorter(intArr,lower,higher));
    }

}