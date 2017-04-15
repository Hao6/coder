package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/3.
 */
public class Question12Test extends TestCase {
    int n;
    StringBuilder str0;
    StringBuilder str1;
    public void setUp() throws Exception {
        super.setUp();
        n=2;
        str0=new StringBuilder("999999");
        str1=new StringBuilder("1");
    }
    public void testSolve() throws Exception {
        Question12.solve(n);
    }
    public void testStrAddition() throws Exception {
        System.out.println(Question12.StrAddition(str0,str1));
    }
    public void testStrAddition1() throws Exception {
        System.out.println(Question12.StrAddition1(str0,str1));
    }
}