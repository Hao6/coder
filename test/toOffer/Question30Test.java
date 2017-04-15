package toOffer;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question30Test extends TestCase {
    Integer intArr[];
    int k;
    Integer intArr1[];
    public void setUp() throws Exception {
        super.setUp();
        intArr = new Integer[]{4, 5, 1, 6, 2, 7, 3, 8, 7, 6, 5};
        intArr1=Arrays.copyOf(intArr,intArr.length);  //数组复制
        k = 6;
    }

    public void testSolve() throws Exception {
        Question30.solve(intArr, k);
        for (int i = 0; i < k; i++) {
            for (int j = k; j < intArr.length; j++) {
                assert (intArr[i] <= intArr[j]);  //[0,k-1]的所有数据均不大于[k,intArr.length)
                // 中的任何一个数据
            }
        }
    }

    public void testSolve1() throws Exception {
        Question30.solve(intArr, k);
        TreeMap kMap = Question30.solve1(intArr1, k);
        int maxValue = (int) kMap.lastKey();
        for (int j = k; j < intArr.length; j++) {
            assert (maxValue <= intArr[j]);  //[0,k-1]的所有数据均不大于[k,intArr.length)
            // 中的任何一个数据
        }
    }

}