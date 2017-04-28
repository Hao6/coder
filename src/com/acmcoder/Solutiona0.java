package com.acmcoder;

import java.util.Scanner;

/**
 * Created by hongji on 2017/4/26.
 */
public class Solutiona0 {
    static Scanner scanner=new Scanner(System.in);
    public int solve(String str,String pattern){
        char sign0='*';
        char sign1='?';
        int strLen=str.length();
        int strLen1=pattern.length();
        int j=0;
        for(int i=0;i<strLen;){
            if(str.charAt(i)==pattern.charAt(j) || pattern.charAt(j)==sign1){
                i++;
                j++;
            }
            else if(j+1<strLen1 && pattern.charAt(j+1)==str.charAt(i)) {
                j++;
            }
            else if(pattern.charAt(j)==sign0){
                i++;
            }
            else{
                return 0;
            }
        }
        if(j==strLen1)
            return 1;
        else
            return 0;
    }
    public static void main(String []args){
        String str=scanner.next();
        String pattern=scanner.next();
        Solutiona0 sa0=new Solutiona0();
        int ret=sa0.solve(str,pattern);
        System.out.println(ret);
    }
}
