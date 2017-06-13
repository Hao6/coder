package com.leetcoder.weekly36;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-11.
 */
public class Solution01Test extends TestCase {
    TreeNode t1;
    TreeNode t2;
    Solution01 solution01;

    public void setUp() throws Exception {
        super.setUp();
        t1 = new TreeNode(1);
        t2 = new TreeNode(2);

        t1.left = new TreeNode(3).left = new TreeNode(5);
        t1.right = new TreeNode(2);

        t2.left = new TreeNode(1);
        t2.right = new TreeNode(3);
        solution01 = new Solution01();
    }

    public void testMergeTrees() throws Exception {
        TreeNode ret = solution01.mergeTrees(t1, t2);
    }

}