package com.acmcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/26.
 */
public class Solutiona0Test extends TestCase {
//    filter(100-trade-done, pattern) = 1,
//    filter(200-trade-done, pattern) = 1,
//    filter(200-paid-done, pattern) = 0
//
//    如果pattern=200-?*-done :
//    filter(100-trade-done, pattern) = 0,
//    filter(200-trade-done, pattern) = 1,
//    filter(200-paid-done, pattern) = 1
//
//    如果pattern=1*trade*done :
//    filter(100-trade-done, pattern) = 1,
//    filter(200-trade-done, pattern) = 0,
//    filter(200-paid-done, pattern) = 0
    String testArr[]={"100-trade-done","200-trade-done","200-paid-done"};
    String patt="*trade-done";
    String patt1="200-?*-done";
    String patt2="1*trade*done";
    Solutiona0 sa0;
    public void setUp() throws Exception {
        super.setUp();
         sa0=new Solutiona0();
    }

    public void testSolve() throws Exception {
        for(int i=0;i<3;i++){
            System.out.println(sa0.solve(testArr[i],patt2));
        }
    }

}