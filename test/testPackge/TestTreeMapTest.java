package testPackge;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/15.
 */
public class TestTreeMapTest extends TestCase {
    public void testSolve() throws Exception {
        TestTreeMap ttm=new TestTreeMap();
        Character []charArr={'d','s','s','e','d'};
        assertEquals('e',(char) ttm.solve(charArr));

    }

}