package testPackge;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/26.
 */
public class testList2VArrayTest extends TestCase {
    int x,y;
    int [][]array;
    public void setUp() throws Exception {
        super.setUp();
        x=10000;
        y=10000;
        array=new int[x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                array[i][j]=i+j;
            }
        }
    }

    public void testTest1() throws Exception {
        testList2VArray.test(array);
    }

    public void testTest11() throws Exception {
        testList2VArray.test1(array);

    }

}