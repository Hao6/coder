package cn.edu.redSkyline;

import junit.framework.TestCase;
import static cn.edu.redSkyline.Util.*;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by hongji on 2017/3/30.
 */
public class BinaryTreeTest extends TestCase {
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

    public void testGrowFreely() throws Exception {
        bt.growFreely(sourceList);
        bt.printBTree(bt.Root,0," ");
    }

    public void testAddFreely() throws Exception {
       for(char temp:sourceList)
           bt.addFreely(temp);
        bt.printBTree(bt.Root,0," ");
    }

    public void testPreorderTravel() throws Exception {
        bt.growFreely(sourceList);
        bt.preorderTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testOrderTravel() throws Exception {
        bt.growFreely(sourceList);
        bt.orderTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testPosteriorTravel() throws Exception {
        bt.growFreely(sourceList);
        bt.posteriorTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testPreorderTravelNoRecursive() throws Exception {
        bt.growFreely(sourceList);
        bt.preorderTravelNoRecursive(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.preorderTravel(bt.Root,result);
        //Iterator itPre1=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testOrderTravelNoRecursive() throws Exception {
        bt.growFreely(sourceList);
        bt.orderTravelNoRecursive(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.orderTravel(bt.Root,result);
        //Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testPosteriorTravelNoRecursive() throws Exception {
        bt.growFreely(sourceList);
        bt.posteriorTravelNoRecursive(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);

        bt.posteriorTravel(bt.Root,result);
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

    public void testLayeredTravel() throws Exception {
        bt.growFreely(sourceList);
        bt.layeredTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        while(itPre.hasNext()==true)
            System.out.print(itPre.next()+" ");
        printDividingLine(100);
        bt.printBTree(bt.Root,0," ");
    }

}