package com.acmcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hao on 17-4-18.
 */
public class Main {
    static Scanner scanner=new Scanner(System.in);
    public void solve(int []array0,int array0Len,int []array1,int array1Len){
        Arrays.sort(array0);
        int tempPosi=0;
        for(int i=0;i<array1Len;i++){
            tempPosi=Arrays.binarySearch(array0,array1[i]);
            if(tempPosi>=0){
                System.out.print(array1[i]+" ");
            }
        }

    }
    public static void main(String []args){
        int array0Len=scanner.nextInt();
        int []array0=new int[array0Len];
        for(int i=0;i<array0Len;i++){
            array0[i]=scanner.nextInt();
        }
        int array1Len=scanner.nextInt();
        int []array1=new int[array1Len];
        for(int i=0;i<array1Len;i++){
            array1[i]=scanner.nextInt();
        }

        Main s2=new Main();
        s2.solve(array0,array0Len,array1,array1Len);
    }
}
