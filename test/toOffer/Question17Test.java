package toOffer;

import cn.edu.redSkyline.LlinkedList;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by hongji on 2017/3/23.
 */
public class Question17Test extends TestCase {
    LlinkedList<Integer> link0;
    LlinkedList<Integer> link1;
    LlinkedList<Integer> link2;
    Random random;
    int link0Len;
    int link1Len;
    final static String SEPARATE_LINE="-------------------------------";
    public void setUp() throws Exception {
        super.setUp();
        link0=new LlinkedList<>();
        link1=new LlinkedList<>();
        random=new Random();
        link0Len=random.nextInt(20);
        link1Len=random.nextInt(20);
        for(int i=0;i<link0Len;i++){
            link0.add(2*i+1);
        }
        for(int i=0;i<link1Len;i++){
            link1.add(2*i);
        }
        Iterator it0=link0.iterator();
        while(it0.hasNext()){
            System.out.println(it0.next());
        }
        System.out.println(SEPARATE_LINE);
        Iterator it1=link1.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println(SEPARATE_LINE);
    }
    public void testSolve() throws Exception {
        Question17.solve(link0,link1);
        assert (link1.isEmpty()==true);
        assert(link0.getSize()==link0Len+link1Len);
        Iterator it0=link0.iterator();
        while(it0.hasNext()){
            System.out.println(it0.next());
        }
        System.out.println(SEPARATE_LINE);
    }

    public void testSolve1() throws Exception {
        link2=Question17.solve1(link0,link1);
        assert (link0.getSize()==link0Len && link1.getSize()==link1Len);
        Iterator it2=link2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(SEPARATE_LINE);
        assert(link2.getSize()==link0Len+link1Len);
    }

}