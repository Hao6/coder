package toOffer;

import cn.edu.redSkyline.BinaryTree;
import cn.edu.redSkyline.DoublePiece;
import junit.framework.TestCase;
import static cn.edu.redSkyline.Util.*;

/**
 * Created by hongji on 2017/3/30.
 */
public class Question6Test extends TestCase {
    DoublePiece<Character> root;
    Character[] preList;  //前序遍历序列
    Character[] orderList; //中序遍历序列
    Character[] postList;  //后序遍历序列
    int listLen;
    BinaryTree<Character> bt;

    public void setUp() throws Exception {
        super.setUp();
        preList = new Character[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        orderList = new Character[]{'C', 'B', 'A', 'F', 'E', 'D', 'I', 'H', 'J', 'G'};
        postList = new Character[]{'C', 'B', 'F', 'E', 'I', 'J', 'H', 'G', 'D', 'A'};
        listLen = preList.length;
    }

    public void testSolve() throws Exception {
        root = Question6.solve(preList, 0, listLen - 1,
                orderList, 0, listLen - 1);
        bt = new BinaryTree<>(root);
        printUserName("testSolve");
        bt.printBTree(root, 0, " ");
        printDividingLine(20);
    }

    public void testSolve1() throws Exception {
        root = Question6.solve1(postList, 0, listLen - 1,
                orderList, 0, listLen - 1);
        bt = new BinaryTree<>(root);
        printUserName("testSolve1");
        bt.printBTree(root, 0, " ");
        printDividingLine(20);

    }

    public void testGetMirror() throws Exception {
        root = Question6.getMirror(preList, 0, listLen - 1,
                orderList, 0, listLen - 1);
        bt = new BinaryTree<>(root);
        printUserName("testGetMirror");
        bt.printBTree(root, 0, " ");
        printDividingLine(20);
    }

}