package com.leetcoder;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/22.
 */
public class Solution120Test extends TestCase {
    List<List<Integer>> data;
    Solution120 s120;

    public void setUp() throws Exception {
        super.setUp();
        s120=new Solution120();
        data=new ArrayList<>();
        List<Integer> data0=new ArrayList<>();
        data0.add(2);
        List<Integer> data1=new ArrayList<>();
        data1.add(3);
        data1.add(4);
        List<Integer> data2=new ArrayList<>();
        data2.add(6);
        data2.add(5);
        data2.add(7);
        data.add(data0);
        data.add(data1);
        data.add(data2);

    }

    public void testMinimumTotal() throws Exception {
        System.out.println(s120.minimumTotal(data));
    }

}