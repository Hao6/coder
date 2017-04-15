package cn.edu.redSkyline;


import java.util.Random;
import static cn.edu.redSkyline.Util.*;

/**
 * Created by hongji on 2017/3/30.
 */
public class BinaryTree<T extends Comparable> {
    DoublePiece<T> assistanceRoot;  //借用一下
    public DoublePiece<T> Root;  //真根
    int size = 0;
    static Random random = new Random();

    public BinaryTree() {        //默认构造函数，一棵连根结点都没有的空二叉树
        assistanceRoot = new DoublePiece<T>();
    }

    public BinaryTree(T rootData) { //含有根节点的二叉树
        assistanceRoot = new DoublePiece<T>();
        Root = new DoublePiece<T>(rootData);
        assistanceRoot.next = Root;
        ++size;
    }
    public BinaryTree(DoublePiece root){  //根
        assert (root!=null);
        assistanceRoot = new DoublePiece<T>();
        Root=root;
    }

    public void growFreely(T[] array) {
        int arrayLen = array.length;
        int i = 0;
        if (assistanceRoot.next == null) {
            Root = new DoublePiece<T>(array[i++]);
            assistanceRoot.next=Root;
        }
        int signOfDirection;
        for (; i < arrayLen; i++) {
            DoublePiece tempRoot = Root;
            while (true) {
                signOfDirection = random.nextInt(2);  //0或1
                if (signOfDirection == 0) {
                    if (tempRoot.next != null) {
                        tempRoot = tempRoot.next;
                    } else {
                        tempRoot.next = new DoublePiece(array[i]);
                        ++size;
                        break;   //插入成功则退出遍历
                    }
                } else { //signOfDirection==1,走右边
                    if (tempRoot.second != null) {
                        tempRoot = tempRoot.second;
                    } else {
                        tempRoot.second = new DoublePiece(array[i]);
                        ++size;
                        break;   //插入成功则退出遍历
                    }
                }
            }
        }
    }

    public void addFreely(T insertData) { //随机插入一个元素,生成树的节奏
        if (assistanceRoot.next == null) {
            Root = new DoublePiece<T>(insertData);
            assistanceRoot.next=Root;
        } else {
            int signOfDirection;
            DoublePiece tempRoot = Root;
            while (true) {
                signOfDirection = random.nextInt(2);  //0或1
                if (signOfDirection == 0) {
                    if (tempRoot.next != null) {
                        tempRoot = tempRoot.next;
                    } else {
                        tempRoot.next = new DoublePiece(insertData);
                        ++size;
                        break; //插入成功则退出遍历
                    }
                } else { //signOfDirection==1,走右边
                    if (tempRoot.second != null) {
                        tempRoot = tempRoot.second;
                    } else {
                        tempRoot.second = new DoublePiece(insertData);
                        ++size;
                        break;   //插入成功则退出遍历
                    }
                }
            }
        }
    }

    public void preorderTravel(DoublePiece piece, LlinkedList<T> resultList) { //前序遍历
        if (piece == null)
            return;
        resultList.add((T) piece.data);
        preorderTravel(piece.next, resultList);
        preorderTravel(piece.second, resultList);
    }

    public void orderTravel(DoublePiece piece, LlinkedList<T> resultList) { //中序遍历
        if (piece == null)
            return;

        orderTravel(piece.next, resultList);
        resultList.add((T) piece.data);
        orderTravel(piece.second, resultList);
    }

    public void posteriorTravel(DoublePiece piece, LlinkedList<T> resultList) { //后序遍历
        if (piece == null)
            return;
        posteriorTravel(piece.next, resultList);
        posteriorTravel(piece.second, resultList);
        resultList.add((T) piece.data);
    }

    public void preorderTravelNoRecursive(DoublePiece piece,     //非递归前序遍历
                                          LlinkedList<T> resultList) {
        assert (resultList != null);
        Sstack<DoublePiece> assistanceStack = new Sstack();
        int initSize = assistanceStack.size();
        DoublePiece tempPiece;
        while (initSize > 0 || piece != null) {
            while (piece != null) {
                assistanceStack.push(piece);
                resultList.add((T) piece.data);
                ++initSize;
                piece = piece.next;
            }
            tempPiece = assistanceStack.pop();
            --initSize;
            piece = tempPiece.second;
        }

    }

    public void orderTravelNoRecursive(DoublePiece piece,
                                       LlinkedList<T> resultList) { //非递归中序遍历
        assert (resultList != null);
        Sstack<DoublePiece> assistanceStack = new Sstack();
        int initSize = assistanceStack.size();
        DoublePiece tempPiece;
        while (initSize > 0 || piece != null) {
            while (piece != null) {
                assistanceStack.push(piece);
                ++initSize;
                piece = piece.next;
            }
            tempPiece = assistanceStack.pop();
            --initSize;
            resultList.add((T) tempPiece.data);
            piece = tempPiece.second;
        }

    }

    public void posteriorTravelNoRecursive(DoublePiece piece,
                                           LlinkedList<T> resultList) { //后序非递归遍历
        assert (resultList != null);
        Sstack<DoublePiece> assistanceStack = new Sstack();
        int initSize = assistanceStack.size();
        DoublePiece tempPiece;
        while (initSize > 0 || piece != null) {
            while (piece != null) {
                assistanceStack.push(piece);
                assistanceStack.push(piece);  //入站两次
                ++initSize;
                ++initSize;
                piece = piece.next;
            }
            tempPiece = assistanceStack.pop();
            --initSize;
            if(tempPiece==assistanceStack.peek()){
                piece = tempPiece.second;
            }else{
                resultList.add((T) tempPiece.data);
            }
        }
    }

    public void layeredTravel(DoublePiece piece, LlinkedList<T> resultList) { //按层遍历
        assert (resultList != null);
        Qqueue<DoublePiece> assistanceQueue = new Qqueue();
        int initSize = assistanceQueue.size();
        DoublePiece tempPiece;
        if(piece!=null){
            assistanceQueue.push(piece);
            ++initSize;
        }
        while (initSize > 0) {
            tempPiece = assistanceQueue.pop();
            --initSize;
            resultList.add((T) tempPiece.data);
            if(tempPiece.next!=null) {
                assistanceQueue.push(tempPiece.next);
                ++initSize;
            }
            if(tempPiece.second!=null) {
                assistanceQueue.push(tempPiece.second);
                ++initSize;
            }
        }
    }
    public void printBTree(DoublePiece piece,int countOfSpace,String sign) { //打印二叉树
        if (piece == null)
            return;
        print(piece.toString(),countOfSpace,sign);
        printBTree(piece.next,countOfSpace+3,"*");
        printBTree(piece.second,countOfSpace+3,"#");
    }
}
