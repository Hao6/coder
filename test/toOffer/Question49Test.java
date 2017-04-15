package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/6.
 */
public class Question49Test extends TestCase {
    String str;
    int i;
    public void setUp() throws Exception {
        super.setUp();
        i=+550;
        str=String.valueOf(i);
    }

    public void testMainProcessor() throws Exception {
        assertEquals((int)Question49.mainProcessor(str), i);
    }

    public void testLitterProcessor() throws Exception {
            //assertEquals(Question49.litterProcessor(str, 0), Integer.valueOf(str));
        }
    }