package cn.edu.redSkyline;

import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by hongji on 2017/3/19.
 */
public class SortAndSearchUnitTest extends TestCase {
    static Random random=new Random();
    Integer [] array=new Integer[40000];
    //Integer [] array={234,456,678,1,-1,2,2};
    public void setUp() throws Exception {
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(100000);
        }
        super.setUp();
    }
    public void testQuickSort() throws Exception {
        SortAndSearchUnit.quickSort(array,0,array.length-1);
        for(int i=1;i<array.length;i++){
            assert(array[i]>=array[i-1]);
        }
    }
    public void testMergeSort() throws Exception {
        SortAndSearchUnit.mergeSort(array,0,array.length-1);
        for(int i=1;i<array.length;i++){
            assert(array[i]>=array[i-1]);
        }
        //assert (SortAndSearchUnit.count==13);  //测试逆序对数量的正确性
    }
    public void testInsertSort() throws Exception {
        SortAndSearchUnit.insertSort(array,0,array.length-1);
        for(int i=1;i<array.length;i++){
            assert(array[i]>=array[i-1]);
        }
    }
    public void testSelectSort() throws Exception {
        SortAndSearchUnit.selectSort(array,0,array.length-1);
        for(int i=1;i<array.length;i++){
            assert(array[i]>=array[i-1]);
        }
    }
    public void testBubbleSort() throws Exception {
        SortAndSearchUnit.bubbleSort(array,0,array.length-1);
        for(int i=1;i<array.length;i++){
            assert(array[i]>=array[i-1]);
        }
    }
}