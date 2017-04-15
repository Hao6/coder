package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question40Test extends TestCase {
    public void testGetSignBit() throws Exception {
        int data=0x12;
        assertEquals(2,Question40.getSignBit(data));
    }

    public void testSolve() throws Exception {
        int intArr[]={2,4,3,4,3,2,5,5,9};
        int res[]=Question40.solve(intArr);
        assert(res!=null);
        if(res[0]>res[1]){
            res[0]^=res[1];
            res[1]^=res[0];
            res[0]^=res[1];
        }
        assert(res[0]==0 && res[1]==9);
    }

}