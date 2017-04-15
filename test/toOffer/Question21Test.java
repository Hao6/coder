package toOffer;

import cn.edu.redSkyline.Sstack;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question21Test extends TestCase {
    Integer[] intArr;
    Sstack<Integer> stack0;
    Sstack<Integer> stack1;
    Random random;
    int i;
    public void setUp() throws Exception {
        super.setUp();
        stack0=new Sstack<Integer>();
        stack1=new Sstack<Integer>();
        intArr=new Integer[]{1,2,3,4,0,7,6,90,675,4};
        random=new Random();
    }

    public void testGetMin() throws Exception {
        Question21 q21=new Question21();
        Question21.minStack ms=q21.new minStack(stack0,stack1);
        for(int temp:intArr){
            i=random.nextInt(2);
            if(i==0 && ms.mainStack.size()>0){
                ms.pop();
            }
            ms.push(temp);
            Integer tempData=(int)Question21.getMin(ms);
            Iterator it=ms.mainStack.iterator();  //遍历栈一遍，确定取得的最小值是否货真价实
            while(it.hasNext()==true){
                assert (tempData.compareTo((Integer) it.next())<=0);
            }
        }
    }

}