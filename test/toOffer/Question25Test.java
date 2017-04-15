package toOffer;

import cn.edu.redSkyline.BinaryTree;
import cn.edu.redSkyline.LlinkedList;
import junit.framework.TestCase;

import java.util.Random;

import static cn.edu.redSkyline.Util.charUpperSet;

/**
 * Created by hongji on 2017/4/1.
 */
public class Question25Test extends TestCase {
    Integer[] sourceList;

    int sourceListLen;
    Random random;
    BinaryTree<Integer> bt;
    LlinkedList<Integer> result;
    public void setUp() throws Exception {
        super.setUp();
        sourceListLen=13;
        random=new Random();
        int dataSetLen=10;  //随机数的范围【0，9】
        sourceList=new Integer[sourceListLen];
        for(int i=0;i<sourceListLen;i++){
            sourceList[i]=random.nextInt(dataSetLen);
        }
        bt=new BinaryTree<>();
        result=new LlinkedList<>();
    }

    public void testSolve() throws Exception {
        bt.growFreely(sourceList);
        bt.printBTree(bt.Root,0," ");
        for(int i=9;i<30;i++) {
            Question25.solve(bt.Root, 0, i, result);
        }
    }

}