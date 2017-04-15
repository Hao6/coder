package toOffer;

import cn.edu.redSkyline.LlinkedList;
import cn.edu.redSkyline.Piece;
import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by hongji on 2017/3/26.
 */
public class Question37Test extends TestCase {
    LlinkedList<Integer> link0;
    LlinkedList<Integer> link1;
    Random random;
    int link0Len;
    int link1Len;
    int commonLen;
    Piece<Integer> commonPiece;
    public void setUp() throws Exception {
        super.setUp();
        link0=new LlinkedList<>();
        link1=new LlinkedList<>();
        random=new Random();
        link0Len=random.nextInt(30);
        link1Len=random.nextInt(30);
        commonLen=random.nextInt(link0Len<link1Len?link0Len:link1Len);
        for(int i=0;i<link0Len-commonLen;i++){
            link0.add(2*i+1);
        }
        for(int i=0;i<link1Len-commonLen;i++){
            link1.add(2*i);
        }
        for(int i=0;i<commonLen;i++){
            Piece<Integer> newCommonPiece=new Piece<>(2*i+2*i-1);
            if(i==0){
                commonPiece=newCommonPiece;  //标记
            }
            link0.add(newCommonPiece);
            link1.add(newCommonPiece);
        }
    }

    public void testSolve() throws Exception {
        assertEquals(commonPiece,Question37.solve(link0,link1));
    }

}