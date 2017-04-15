package toOffer;

import cn.edu.redSkyline.Qqueue;
import cn.edu.redSkyline.Sstack;
import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question7Test extends TestCase {
    Sstack<Integer> stack0;
    Sstack<Integer> stack1;
    Qqueue<Integer> queue0;
    Qqueue<Integer> queue1;
    Sstack<Integer> stack;
    Qqueue<Integer> queue;
    Integer[] intArr;
    Random random;
    int i;
    public void setUp() throws Exception {
        super.setUp();
        stack0=new Sstack<Integer>();
        stack1=new Sstack<Integer>();
        queue0=new Qqueue<Integer>();
        queue1=new Qqueue<Integer>();
        stack=new Sstack<Integer>();
        queue=new Qqueue<>();
        intArr=new Integer[]{1,2,3,4,5,6,5,4,3,23,45,0};
        random=new Random();
    }

    public void testGetATwoStacks2Queue() throws Exception {
        Question7.twoStacks2Queue sq=Question7.getATwoStacks2Queue(stack0,stack1);
        for(int temp:intArr){
            i=random.nextInt(2);
            if(i==0 && sq.size()>0 && queue.size()>0){
                assert (sq.pop()==queue.pop());
            }
            sq.push(temp);
            queue.push(temp);
        }
        while(sq.size()>0 && queue.size()>0){
            assert (sq.pop()==queue.pop());
        }
    }

    public void testGetATwoQueues2Stack() throws Exception {
        Question7.twoQueues2Stack qs=Question7.getATwoQueues2Stack(queue0,queue1);
        for(int temp:intArr){
            i=random.nextInt(2);
            if( qs.size()>0 && stack.size()>0 && i==0){
                assert (qs.pop()==stack.pop());
            }
            qs.push(temp);
            stack.push(temp);
        }
        while(qs.size()>0 && stack.size()>0){
            assert (qs.pop()==stack.pop());
        }
    }

}