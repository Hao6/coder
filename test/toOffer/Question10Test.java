package toOffer;

import cn.edu.redSkyline.StringUnit;
import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/12.
 */
public class Question10Test extends TestCase {
    int intData=-932;
    String binaryString=Integer.toBinaryString(intData); //转化为二进制字符串
    Question10 q10=new Question10();
    int oneOfCount=StringUnit.charCount(binaryString,'1'); //计算字符'1'在字符串中出现的次数
    public void testSolve() throws Exception {
        assertEquals(q10.solve(intData), oneOfCount);
    }

    public void testSolve1() throws Exception {
        assertEquals(q10.solve1(intData), oneOfCount);
    }

    public void testSolve2() throws Exception {
        assertEquals(q10.solve2(intData), oneOfCount);
    }
    public void testSolve3() throws Exception{
        assertEquals(q10.solve3(intData), oneOfCount);
    }
}