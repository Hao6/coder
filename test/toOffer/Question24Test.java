package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/1.
 */
public class Question24Test extends TestCase {
    Integer []array;
    int lengthArr;
    public void setUp() throws Exception {
        super.setUp();

        array=new Integer[]{7,6,5,4,};
        lengthArr=array.length;
    }
    //需要设计一个巧妙的测试案例，根据后序结果重建二叉搜素树，然后判断该树是否满足二叉搜索树的特点？？？
    public void testSolve() throws Exception {
        assertEquals(true,Question24.solve(array,0,lengthArr-1));
    }

}