package cn.edu.redSkyline;

import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by hongji on 2017/3/22.
 */
public class LlinkedListTest extends TestCase {
    Random random;
    LlinkedList<Integer> link0;
    LlinkedList<Integer> link1;
    int length;
    Iterator iterator;
    public void setUp() throws Exception {
        super.setUp();
        link0=new LlinkedList();
        link1=new LlinkedList();
        random=new Random();
        length=10;
        iterator=link0.iterator();
        for(int i=0;i<length;i++){
            link0.add(random.nextInt(100));
        }
        while(iterator.hasNext()==true){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("---------------------------------");
    }

    public void testAdd() throws Exception {
        iterator=link0.iterator();
        for(int i=0;i<length;i++){
            link0.add(random.nextInt(100));
        }
        while(iterator.hasNext()==true){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("---------------------------------");
    }

    public void testAdd1() throws Exception {
        iterator=link0.iterator();
        link0.add(10,200);
        while(iterator.hasNext()==true){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("---------------------------------");
    }

    public void testRemove() throws Exception {
        iterator=link0.iterator();
        link0.remove();
        while(iterator.hasNext()==true){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("---------------------------------");
    }

    public void testRemove1() throws Exception {
        iterator=link0.iterator();
        link0.remove(10);
        while(iterator.hasNext()==true){
            System.out.println(iterator.next()+" ");
        }
        System.out.println("---------------------------------");
    }

    public void testIsEmpty() throws Exception {
        assertEquals(true,link1.isEmpty());
        assertEquals(false,link0.isEmpty());
    }

}