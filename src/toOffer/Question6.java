package toOffer;

import cn.edu.redSkyline.DoublePiece;

/**
 * Created by hongji on 2017/3/30.
 */
public class Question6 {
    //根据输入的（前序、中序）或（后序、中）遍历序列重建二叉树
    public static<T extends Comparable> DoublePiece<T>
    solve(T []preorderList, int preLower, int preHigher, //前序序列
                                       T []orderList, int orderLower, int orderHigher){ //中序序列
        if(preHigher==preLower){
            return new DoublePiece<T>(preorderList[preLower]);
        }else if(preHigher<preLower) {
            return null;
        }else{
            T curTreeRootData=preorderList[preLower];  //当前子树的根节点
            //在中序序列中寻找curTreeRootData,利用其将中序序列分为左右两个子树
            int i=0;
            for(i=orderLower;i<=orderHigher;i++){
                if(orderList[i].compareTo(curTreeRootData)==0){
                    break;
                }
            }
            DoublePiece<T> curTreeRoot=new DoublePiece(curTreeRootData);
            curTreeRoot.next=solve(preorderList,preLower+1,preLower+i-orderLower,
                    orderList,orderLower,i-1);
            curTreeRoot.second=solve(preorderList,preLower+i-orderLower+1,preHigher,
                    orderList,i+1,orderHigher);
            return curTreeRoot;
        }
    }

    public static<T extends Comparable> DoublePiece<T>
    getMirror(T []preorderList, int preLower, int preHigher, //前序序列
          T []orderList, int orderLower, int orderHigher) { //中序序列
        if(preHigher==preLower){
            return new DoublePiece<T>(preorderList[preLower]);
        }else if(preHigher<preLower) {
            return null;
        }else{
            T curTreeRootData=preorderList[preLower];  //当前子树的根节点
            //在中序序列中寻找curTreeRootData,利用其将中序序列分为左右两个子树
            int i=0;
            for(i=orderLower;i<=orderHigher;i++){
                if(orderList[i].compareTo(curTreeRootData)==0){
                    break;
                }
            }
            DoublePiece<T> curTreeRoot=new DoublePiece(curTreeRootData);
            curTreeRoot.second=getMirror(preorderList,preLower+1,preLower+i-orderLower,
                    orderList,orderLower,i-1);
            curTreeRoot.next=getMirror(preorderList,preLower+i-orderLower+1,preHigher,
                    orderList,i+1,orderHigher);
            return curTreeRoot;
        }
    }




    public static<T extends Comparable> DoublePiece<T>
    solve1(T []posterList, int postLower, int postHigher, //后序序列
          T []orderList, int orderLower, int orderHigher){ //中序序列
        if(postHigher==postLower){
            return new DoublePiece<T>(posterList[postHigher]);
        }else if(postHigher<postLower) {
            return null;
        }else{
            T curTreeRootData=posterList[postHigher];  //当前子树的根节点，后序遍历序列的最后一个元素
            //在中序序列中寻找curTreeRootData,利用其将中序序列分为左右两个子树
            int i=0;
            for(i=orderLower;i<=orderHigher;i++){
                if(orderList[i].compareTo(curTreeRootData)==0){
                    break;
                }
            }
            DoublePiece<T> curTreeRoot=new DoublePiece(curTreeRootData);
            curTreeRoot.next=solve1(posterList,postLower,postLower+i-1-orderLower,
                    orderList,orderLower,i-1);
            curTreeRoot.second=solve1(posterList,postLower+i-orderLower,postHigher-1,
                    orderList,i+1,orderHigher);
            return curTreeRoot;
        }
    }
}
