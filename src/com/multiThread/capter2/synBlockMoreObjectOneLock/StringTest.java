package com.multiThread.capter2.synBlockMoreObjectOneLock;

/**
 * Created by hao on 17-6-1.
 */
public class StringTest {
    public static void main(String[] args) {
        String a=new String("a");
        String b=new String("a");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}
