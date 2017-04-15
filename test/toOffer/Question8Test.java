package toOffer;

import cn.edu.redSkyline.ArrayUnit;
import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/12.
 */
public class Question8Test extends TestCase {
    public void testSolve() throws Exception {
        Integer intArr[]=new Integer[]{0,0};

        ArrayUnit.rotateArr(intArr,3);
        ArrayUnit.print(intArr);
        Question8 q8=new Question8();
        assertEquals(q8.solve(intArr),0);
    }

}