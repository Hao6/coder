package cn.edu.redSkyline;

import junit.framework.TestCase;

import java.util.Arrays;

/**
 * Created by hongji on 2017/3/12.
 */
public class ArrayUnitTest extends TestCase {
    Integer intArr[]={1,3,5,7,9,12};
    Integer []intArrTest= Arrays.copyOfRange(intArr,0,intArr.length);
    public void testRotateArr() throws Exception {
        int i=0,j=intArr.length,count=3;
        ArrayUnit.rotateArr(intArr,count);
        while(i<j){
            assertEquals(intArrTest[i],intArr[(i+count)%j]);
            ++i;
        }
    }

    public void testReplaceArr() throws Exception {
        int i=0,j=intArr.length;
        ArrayUnit.replaceArr(intArr,i,j);
        while(i<intArr.length){
            assertEquals(intArr[i++],intArrTest[--j]);
        }
    }
}