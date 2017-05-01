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
        //float num=(float)(Math.round(totalPrice*100)/100);
        //使float保留n位小数
        System.out.println(totalPrice);
        String aStr=String .format("%.4f",totalPrice);
        System.out.println(aStr);
    }
    public void testLeftMove(){
        int data=1;
        System.out.println(1<<31);
        String a="100";
        System.out.println(a.compareTo("100"));
    }
    public void testPrintf()throws Exception{
        int a=1,b=2,c=3,d=4;
        System.out.println(a+b+"Hello"+c+d);
        System.out.println(a+b+"Hello"+(c+d));
        System.out.println(a+b+"Hello"+c*d);
        System.out.println(true&false);

        System.out.println(a<0 && ++b<0);
        System.out.println(b);
        System.out.println(a<0 & ++b<0);
        System.out.println(b);
    }

    public void testOperatorFun(){
        char ca=5;
        //char b=-5;  char类型非负
        //long moveDis=1111111111;
        char moveDis=5;
        byte ba=5;
        byte bb=-5;
        short sa=5;
        short sb=-5;
        //ba=ba<<2;  由于左移时进行了类型提升，所以编译报错
        System.out.println(Integer.toBinaryString(ba<<moveDis)+" "+(ba<<moveDis));
        System.out.println(Integer.toBinaryString(bb<<moveDis)+" "+(bb<<moveDis));
        ba<<=moveDis;
        bb<<=moveDis;
        System.out.println(Integer.toBinaryString(ba)+" "+(ba));
        System.out.println(Integer.toBinaryString(bb)+" "+(bb));

//        int ia=0x0000000f;
//        int ib=0x8000000f;
//        System.out.println(Integer.toBinaryString(ia)+" "+(ia));
//        System.out.println(Integer.toBinaryString(ib)+" "+(ib));
//        System.out.println(Integer.toBinaryString(ia<<28)+" "+(ia<<28));
//        System.out.println(Integer.toBinaryString(ib<<3)+" "+(ib<<3));
        int a=0xfffffec0;
        byte by=96;
        System.out.println((byte)a);
        System.out.println(Integer.toBinaryString(by)+" "+(int)by);

        int aa=-1;
        float ff=8f;
        short sh=5;
        long h=8l;
        double df=9;
        float test=ff*sh;
        double testl=h*df;
        float testt=h*ff;

        System.out.println(+aa);
        String testS="hello";
        switch (testS){
            case "Hello":
                System.out.println(testS);
                break;
            default:
                System.out.println("unKnow");
        }

    }



}