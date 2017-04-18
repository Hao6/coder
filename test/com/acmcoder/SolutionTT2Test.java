package com.acmcoder;

import junit.framework.TestCase;

import java.util.Scanner;

/**
 * Created by hao on 17-4-18.
 */
public class SolutionTT2Test extends TestCase {
    int []array;
    Scanner scanner;
    int arrayLen;
    int target;
    SolutionTT2 s2;
    public void setUp() throws Exception {
        super.setUp();
        //array=new int[]{3,5,7,9,16,17};
        s2=new SolutionTT2();

    }
    public void testArraysSearch()throws Exception{
        scanner=new Scanner(System.in);
        arrayLen=scanner.nextInt();
        target=scanner.nextInt();
        for(int i=0;i<arrayLen;i++){
            array[i]=i+1;
        }
        System.out.println(s2.solve(array,arrayLen,target));
    }
    public void testLong()throws Exception{
        System.out.println(Long.MAX_VALUE);
    }

    public void testFloat()throws Exception{
        float a=89.89f;
        int itemNum=3;
        float totalPrice=a*itemNum;
        float num=(float)(Math.round(totalPrice*100)/100);
        System.out.println(num);
    }

}