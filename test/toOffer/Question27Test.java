package toOffer;

import cn.edu.redSkyline.BinaryTree;
import cn.edu.redSkyline.DoublePiece;
import cn.edu.redSkyline.LlinkedList;
import cn.edu.redSkyline.Piece;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

import static cn.edu.redSkyline.Util.charUpperSet;
import static cn.edu.redSkyline.Util.printDividingLine;

/**
 * Created by hongji on 2017/4/1.
 */
public class Question27Test extends TestCase {
    Character[] sourceList;
    LlinkedList<Character> result;

    int sourceListLen;
    Random random;
    BinaryTree<Character> bt;
    public void setUp() throws Exception {
        super.setUp();
        sourceListLen=230;
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
        //bt.printBTree(bt.Root,0," ");
        bt.orderTravel(bt.Root,result);
        Iterator itPre=result.iterator();
        DoublePiece<Character> doubleList=Question27.solve(bt.Root);
        DoublePiece tempFirst=doubleList;
        while(tempFirst!=null && itPre.hasNext()==true){
            Piece tempPiece=(Piece)itPre.next();
            assertEquals(tempFirst.data,tempPiece.data);
            tempFirst=tempFirst.second;
        }
    }

}