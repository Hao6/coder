package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question11Test extends TestCase {
    double []base;
    int []exponent;
    public void setUp() throws Exception {
        super.setUp();
        base=new double[]{-3,-2,-1,0,1,2,3};
        exponent=new int[]{-3,-2,-1,0,1,2,3};
    }

    public void testSolve() throws Exception {
        for(int i=0;i<base.length;i++){
            for(int j=0;j<exponent.length;j++){
                assertEquals(Math.pow(base[i],exponent[j]),Question11.solve(base[i],exponent[j]));
            }
        }
    }

}