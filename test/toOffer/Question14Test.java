package toOffer;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question14Test extends TestCase {
    int intArr[];
    int sign;
    int intArrLen;
    IsOneOfAKind []dataArr;
    public void setUp() throws Exception {
        super.setUp();
        intArr=new int[]{1,3,4,3,5,6,7,6,8,5,10,34,56,21};
        intArrLen=intArr.length;
        dataArr=new OddOrEven[intArrLen];
        for(int i=0;i<intArrLen;i++){
            dataArr[i]=new OddOrEven(intArr[i]);
        }
        sign=0;
    }

    public void testSolve() throws Exception {
        Question14.solve(dataArr);
        for(int i=0;i<intArrLen;i++){
            if(dataArr[i].isTheKind()==false && sign%2==0 ||
                    dataArr[i].isTheKind()==true && sign%2==1){
                sign++;
            }
            assert(sign<=2 && intArr[0]%2==1);
        }

    }

}