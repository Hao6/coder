package toOffer;

import cn.edu.redSkyline.LlinkedList;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by hongji on 2017/3/22.
 */
public class Question16Test extends TestCase {
    Random random;
    int size;
    LlinkedList<Integer> link0;
    LlinkedList<Integer> link1;
    final static String SEPARATE_LINE="-------------------------------";
    public void setUp() throws Exception {
        super.setUp();
        random=new Random();
        size=10;
        link0=new LlinkedList<>();
        link1=new LlinkedList<>();
    }

    public void testSolve() throws Exception {
        int num;
        for(int i=0;i<size;i++){
            num=random.nextInt(100);
            link0.add(num);
            link1.add(num);
        }
        Question16.solve(link0);
        Iterator it0=link0.iterator();
        Iterator it1=link1.iterator();
        while(it0.hasNext()){
            System.out.println(it0.next());
        }
        System.out.println(SEPARATE_LINE);
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }

    public void testSolve1() throws Exception {
        int num;
        for(int i=0;i<size;i++){
            num=random.nextInt(100);
            link0.add(num);
            link1.add(num);
        }
        Question16.solve1(link0);
        Iterator it0=link0.iterator();
        Iterator it1=link1.iterator();
        while(it0.hasNext()){
            System.out.println(it0.next());
        }
        System.out.println(SEPARATE_LINE);
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }

}