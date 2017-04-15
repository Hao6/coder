package toOffer;

import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question44Test extends TestCase {
    Question44.Poker[] seriousPoker=new Question44.Poker[5];
    public void setUp() throws Exception {
        super.setUp();
        Question44 q44=new Question44();
        q44.getApoker();
        Random random=new Random();
        for(int i=0;i<seriousPoker.length;i++){  //随机抽取5张
            int tempIndex=random.nextInt(Question44.ipoker.size());
            seriousPoker[i]=Question44.ipoker.remove(tempIndex);
        }
    }

    public void testSolve() throws Exception {
        assertEquals(false,Question44.solve(seriousPoker));
    }

}