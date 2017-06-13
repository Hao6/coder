package com.leetcoder.weekly36;

/**
 * Created by hao on 17-6-11.
 */
//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int i) {
        val = i;
    }
}

public class Solution01 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null)
            return null;
        TreeNode retTree = null;
        if (t1 != null) {
            retTree = new TreeNode(0);
            retTree.val += t1.val;
        }
        if (t2 != null) {
            if (retTree == null) {
                retTree = new TreeNode(0);
            }
            retTree.val += t2.val;
        }
        TreeNode tempT1 = null;
        TreeNode tempT2 = null;
        TreeNode tempT3 = null;
        TreeNode tempT4 = null;

        if (t1 != null) {
            tempT1 = t1.left;
            tempT2 = t1.right;
        }
        if (t2 != null) {
            tempT3 = t2.left;
            tempT4 = t2.right;
        }
        retTree.left = mergeTrees(tempT1, tempT3);
        retTree.right = mergeTrees(tempT2, tempT4);
        return retTree;
    }
}
