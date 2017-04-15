package com.leetcoder;

import junit.framework.TestCase;

import java.util.Scanner;

/**
 * Created by hongji on 2017/4/14.
 */
public class Solution21Test extends TestCase {
    ListNode l1=null;
    ListNode l2=null;
    Scanner scanner;
    public void setUp() throws Exception {
        super.setUp();
    }

    public void testMergeTwoLists() throws Exception {
        scanner=new Scanner(System.in);
        System.out.println("输入数据");
        String str0=scanner.next();
        String str1=scanner.next();
        String []strArr0=str0.substring(1,str0.length()-1).split(",");
        String []strArr1=str1.substring(1,str1.length()-1).split(",");
        ListNode tempL1=null;
        ListNode tempL2=null;
        for(String temp:strArr0){
            if(tempL1==null){
                tempL1=new ListNode(Integer.valueOf(temp));
                l1=tempL1;
            }else{
                tempL1.next=new ListNode(Integer.valueOf(temp));
                tempL1=tempL1.next;
            }
        }
        for(String temp:strArr1){
            if(tempL2==null){
                tempL2=new ListNode(Integer.valueOf(temp));
                l2=tempL2;
            }else{
                tempL2.next=new ListNode(Integer.valueOf(temp));
                tempL2=tempL2.next;
            }
        }
        while(l1!=null){
            System.out.println(l1.val);
        }
        while(l2!=null){
            System.out.println(l2.val);
        }
    }

}