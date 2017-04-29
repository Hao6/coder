package com.leetcoder;

import cn.edu.redSkyline.CollectionUnit;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by hongji on 2017/4/29.
 */
public class Solution386Test extends TestCase {
    int n;
    Solution386 s386;
    public void setUp() throws Exception {
        super.setUp();
        s386=new Solution386();
        n=12;
    }

    public void testLexicalOrder() throws Exception {
        List<Integer> ret=s386.lexicalOrder(n);
        CollectionUnit.printCollection(ret);
    }

}