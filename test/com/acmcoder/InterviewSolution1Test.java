package com.acmcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/29.
 */
public class InterviewSolution1Test extends TestCase {
    int []dataArr;
    InterviewSolution1 is1;
    public void setUp() throws Exception {
        super.setUp();
        is1=new InterviewSolution1();
        dataArr=new int[]{1,0,0,8,0,8,8,8,1,0,0,0,1};
    }

    public void testSolve() throws Exception {
        is1.solve(dataArr);
        for(int i=0;i<dataArr.length;i++){
            System.out.print(dataArr[i]+" ");
        }
        System.out.println();
    }

    public void testSwapSequence() throws Exception {
        is1.swapSequence(dataArr,0,3,4,5);
        for(int i=0;i<dataArr.length;i++){
            System.out.print(dataArr[i]+" ");
        }
        System.out.println();
    }

    public void testSwapElement() throws Exception {
        is1.swapElement(dataArr,0,3);
        for(int i=0;i<dataArr.length;i++){
            System.out.print(dataArr[i]+" ");
        }
        System.out.println();
    }

}