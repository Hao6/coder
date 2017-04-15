package toOffer;

import cn.edu.redSkyline.BinaryTree;
import cn.edu.redSkyline.LlinkedList;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

import static cn.edu.redSkyline.Util.charUpperSet;
import static cn.edu.redSkyline.Util.printDividingLine;

/**
 * Created by hongji on 2017/3/31.
 */
public class Question19Test extends TestCase {
    Character[] sourceList;

    int sourceListLen;
    LlinkedList<Character> result;
    Random random;
    BinaryTree<Character> bt;
    public void setUp() throws Exception {
        super.setUp();
        sourceListLen=13;
        random=new Random();
        sourceList=new Character[sourceListLen];
        int charSetLen=charUpperSet.length();
        for(int i=0;i<sourceListLen;i++){
            sourceList[i]=charUpperSet.charAt(random.nextInt(charSetLen));
        }
        bt=new BinaryTree<>();
        result=new LlinkedList<>();
    }

    public void testSolve() throws Exception {
        bt.growFreely(sourceList);
        bt.orderTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");

        Question19.solve(bt.Root);
        bt.orderTravel(bt.Root,result);
        //Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

}