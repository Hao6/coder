package toOffer;

import cn.edu.redSkyline.CollectionUnit;
import cn.edu.redSkyline.DoublePiece;
import cn.edu.redSkyline.LlinkedList;

import java.util.Iterator;

/**
 * Created by hongji on 2017/4/1.
 */
//二叉树中和为某一特定值的路径，输入二叉树的根节点，以及特定值，输出路径
public class Question25 {
    public static void solve(DoublePiece<Integer> root, int tempSum,
                             int destNum, LlinkedList<Integer> pathList){
        if(root==null)
            return;
        tempSum+=root.data;
        if(tempSum<=destNum){
            pathList.add(root.data);
        }else {
            tempSum-= root.data;
            return;
        }
        if(tempSum==destNum){
            Iterator iterator=pathList.iterator();
            int count=1;
            System.out.print("{");
            while(iterator.hasNext()){
                System.out.print(iterator.next()+" ");
                if(count++%40==0){
                    System.out.println();
                }
            }
            System.out.println(tempSum+ "}");
            pathList.remove();
            tempSum-=root.data;
            return;
        }
        solve(root.next,tempSum,destNum,pathList);
        solve(root.second,tempSum,destNum,pathList);
        pathList.remove();
        tempSum-=root.data;
    }
}
