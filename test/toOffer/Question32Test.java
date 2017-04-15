package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question32Test extends TestCase {
    int n;
    int countOfOne=0;
    public void setUp() throws Exception {
        super.setUp();
        n=1001230001;
        for(int i=1;i<=n;i++){
            int temp=i;
            while(temp>0) {
                if (temp % 10 == 1) {
                    ++countOfOne;
                }
                temp/=10;
            }
        }
    }

    public void testSolve() throws Exception {
        assertEquals(countOfOne,Question32.solve(n));
    }

}