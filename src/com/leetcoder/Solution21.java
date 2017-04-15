package com.leetcoder;

import java.util.Scanner;

/**
 * Created by hongji on 2017/4/14.
 */
public class Solution21 {
    private Solution21(){

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        if(l1.val<=l2.val){
            ListNode tempL=l1;
            l1=l2;
            l2=tempL;
        }
        ListNode tempL1 = l1,preTempL1=null;
        ListNode tempL2 = l2,preTempL2=null;
        while (tempL1 != null && tempL2 != null) {
            while (tempL1!=null && tempL2 != null) {
                if(tempL1.val >= tempL2.val) {
                    preTempL2 = tempL2;
                    tempL2 = tempL2.next;
                }else{
                    break;
                }
            }
            while (tempL1!=null && tempL2 != null) {
                if(tempL1.val<tempL2.val){
                    preTempL1=tempL1;
                    tempL1=tempL1.next;
                }else
                    break;
            }
            preTempL2.next=l1;  //preTempl2不会为null
            if(tempL2!=null)
                preTempL1.next=tempL2;
            l1=tempL1;
            preTempL1=null;
            preTempL2=null;
        }
            return l2;
    }

    public static void main(String[] args) {
        ListNode l1=null;
        ListNode l2=null;
        Scanner scanner;
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
//        while(l1!=null){
//            System.out.println(l1.val);
//            l1=l1.next;
//        }
//        while(l2!=null){
//            System.out.println(l2.val);
//            l2=l2.next;
//        }
        Solution21 s21=new Solution21();
        ListNode L3=s21.mergeTwoLists(l1,l2);
        while(L3!=null){
            System.out.println(L3.val);
            L3=L3.next;
        }
    }
}
