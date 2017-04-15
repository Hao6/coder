package toOffer;

import cn.edu.redSkyline.DoublePiece;

/**
 * Created by hongji on 2017/3/31.
 */
//原地将二叉树转为镜像
public class Question19 {
    public static void solve(DoublePiece root){
        if(root==null){
            return;
        }
        DoublePiece tempDoublePiece;
        tempDoublePiece=root.next;
        root.next=root.second;
        root.second=tempDoublePiece;
        solve(root.next);
        solve(root.second);
    }
}
