package toOffer;

import cn.edu.redSkyline.DoublePiece;

/**
 * Created by hongji on 2017/3/31.
 */
//求一棵二叉树的深度
public class Question39 {
    public static int solve(DoublePiece root){
        if(root==null){
            return 0;
        }
        int leftDepth=solve(root.next);
        int rightDepth=solve(root.second);
        return 1+(leftDepth>rightDepth?leftDepth:rightDepth);
    }
    //判断一颗二叉树是否是平衡二叉树,任意一个根节点的左右子树的高度相差不超过1
    public static int checkHeight(DoublePiece dPiece){
        if(null==dPiece){
            return 0;
        }
        int leftDepth=checkHeight(dPiece.next);
        int rightDepth=checkHeight(dPiece.second);
        if(leftDepth==-1 || rightDepth==-1 || Math.abs(leftDepth-rightDepth)>1){
            return -1;
        }
        return Math.max(leftDepth,rightDepth)+1;
    }
    public static boolean solve1(DoublePiece root){
        if(checkHeight(root)==-1){
            return false;
        }else{
            return true;
        }
    }
}
