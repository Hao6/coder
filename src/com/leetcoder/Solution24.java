package com.leetcoder;

/**
 * Created by hongji on 2017/4/9.
 */
public class Solution24 {
    ListNode l=new ListNode(1);
    ListNode l0=new ListNode(2);
    ListNode l1=new ListNode(3);
    ListNode l2=new ListNode(4);
    ListNode l3=new ListNode(5);
    public ListNode swapPairs() {
        l.next=l0;
        l0.next=l1;
        l1.next=l2;
        l2.next=l3;
        l3.next=null;
        ListNode head=l;

        ListNode first=null,second=null;
        if(head.next!=null){
            first=head;
        }
        else
            return head;
        ListNode tempNode=null;
        ListNode ffirst=null;
        if(first.next!=null)
            tempNode=first.next;

        while(first.next!=null){
            second=first.next;
            first.next=second.next;
            if(ffirst!=null){
                ffirst.next=second;
            }
            second.next=first;
            ffirst=first;
            first=first.next;
            if(first==null)
                break;
        }
        return tempNode;
    }
}
