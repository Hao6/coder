package toOffer;

import cn.edu.redSkyline.DoublePiece;

/**
 * Created by hongji on 2017/4/1.
 */
//将一颗二叉搜索树转化为一个有序双向链表，不能创建新的piece，只能调整现存piece中的指针指向
public class Question27 {
    public static DoublePiece solve(DoublePiece root){
        if(root==null || root.isLeaf()==true){
            return root;
        }else{
            DoublePiece leftSubtree=solve(root.next);
            DoublePiece rightSubtree=solve(root.second);
            if(rightSubtree!=null) {
                root.second = rightSubtree;
                rightSubtree.next = root;
            }else {
                root.second=null;
            }
            if(leftSubtree!=null) {
                DoublePiece tempEnd = leftSubtree;
                while (tempEnd.second != null) {
                    tempEnd = tempEnd.second;
                }
                tempEnd.second = root;
                root.next = tempEnd;
            }else{
                root.next = null;
            }
            return leftSubtree!=null?leftSubtree:root;
        }
    }
}
