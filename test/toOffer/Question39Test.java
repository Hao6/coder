package toOffer;

import cn.edu.redSkyline.BinaryTree;
import junit.framework.TestCase;

import java.util.Random;

import static cn.edu.redSkyline.Util.charUpperSet;

/**
 * Created by hongji on 2017/3/31.
 */
public class Question39Test extends TestCase {
    Character[] sourceList;
    int sourceListLen;
    Random random;
    BinaryTree<Character> bt;
    public void setUp() throws Exception {
        super.setUp();
        sourceListLen=5;
        random=new Random();
        sourceList=new Character[sourceListLen];
        int charSetLen=charUpperSet.length();
        for(int i=0;i<sourceListLen;i++){
            sourceList[i]=charUpperSet.charAt(random.nextInt(charSetLen));
        }
        bt=new BinaryTree<>();

    }

    public void testSolve() throws Exception {
        bt.growFreely(sourceList);
        int countOfSpace=0;
        bt.printBTree(bt.Root,countOfSpace," ");
        System.out.println(Question39.solve(bt.Root));
    }
    public  void testSolve1() throws Exception {
        bt.growFreely(sourceList);
        int countOfSpace=0;
        bt.printBTree(bt.Root,countOfSpace," ");
        System.out.println(Question39.solve1(bt.Root));
    }


}