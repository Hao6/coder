package com.acmcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/26.
 */
public class MainTest extends TestCase {
    String a="1 2 3    8 +";
    public void setUp() throws Exception {
        super.setUp();

    }
    public void testStr()throws Exception{
        String []arr=a.split(" ");
        for(String temp: arr){
            System.out.println(temp);
        }
    }

}