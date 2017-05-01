package com.leetcoder;

import cn.edu.redSkyline.ArrayUnit;
import cn.edu.redSkyline.CollectionUnit;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hongji on 2017/4/21.
 */
public class Solution15Test extends TestCase {
    int []nums;
    Solution15 s15;
    List<List<Integer>> ret;
    public void setUp() throws Exception {
        super.setUp();
        s15=new Solution15();
        nums=new int[]{-4,-2,1,-5,-4,-4,4,-2,0,4,0,-2,3,1,-5,0};
    }

    public void testThreeSum() throws Exception {
        ret=s15.threeSum(nums);
        for(List<Integer> temp: ret){
            CollectionUnit.printCollection(temp);
        }
    }
    public void testBSearch()throws Exception{
        int []data={-1,-3,-7,-2};
        int []data1={1,5,6,7};
        int []data2={0,0,0,0,0,0};

        System.out.println(Arrays.binarySearch(data,0));
        System.out.println(Arrays.binarySearch(data1,0));
        System.out.println(Arrays.binarySearch(data2,0));

    }

}