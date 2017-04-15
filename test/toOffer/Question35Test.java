package toOffer;

import junit.framework.TestCase;

import java.util.Objects;

/**
 * Created by hongji on 2017/3/15.
 */
public class Question35Test extends TestCase {
    public void testSolve() throws Exception {
        Question35 q35=new Question35();
        Ranger []charArr={new Ranger('s',0),
                new Ranger('d',1),
                new Ranger('d',2),
                new Ranger('e',3),
                new Ranger('s',4)};
        assertEquals('e',q35.solve(charArr).data);

//        Ranger a=new Ranger('e',0);
//        Object b=new Ranger('e',3);
//
//        System.out.println((a.equals(b)));  //<1>
//        System.out.println(a+" "+b);  //<2>,  <1>为true,则<2>输出值应该一致
//        System.out.println(a.compareTo((Ranger)b));
    }

}