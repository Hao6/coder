package com.leetcoder;

import cn.edu.redSkyline.CollectionUnit;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hongji on 2017/4/14.
 */
public class Solution22Test extends TestCase {
    int n;
    List<String> list;
    Solution22 s22;
    public void setUp() throws Exception {
        super.setUp();
        list=new ArrayList<>();
        s22=new Solution22();
    }

    public void testGenerateParenthesis() throws Exception {
        s22.generateParenthesis(2,list);
        CollectionUnit.printCollection(list);
    }

}