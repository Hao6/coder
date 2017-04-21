package com.acmcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hao on 17-4-18.
 */
public class SolutionTT2 {
    static Scanner scanner=new Scanner(System.in);
    public int solve(int []array,int arrayLen,int target){

        int helpMax=1,helpMin=0,count=0,helpMMax=0;
        for(int i=0;i<32;i++){
            if(helpMax>target){
                break;
            }else{
                helpMax*=2;
            }
        }
        helpMin=helpMax/2;
        helpMMax=helpMax*2;
        //[helpMax,]与其他组合均可以
        //[helpMax,]内部组合不一定可以
        //[,helpMin)集合内的组合均不可以
        Arrays.sort(array);   //排序

        int helpMaxIndex = Arrays.binarySearch(array, helpMax);
        int helpMinIndex=Arrays.binarySearch(array,helpMin);
        if(helpMinIndex<0){
            helpMinIndex=-helpMinIndex-1;
        }
        if(helpMaxIndex<0){
            helpMaxIndex=-helpMaxIndex-1;
        }
        for(int i=0;i<helpMinIndex;i++){
            for(int j=helpMinIndex;j<helpMaxIndex;j++){
                if((array[i]^array[j])>target){
                    count++;
                }
            }
        }
        int temp=arrayLen-helpMaxIndex;
        count+=temp*helpMaxIndex;
        //int helpMMaxIndex=Arrays.binarySearch(array,helpMMax);
//        for(int i=helpMaxIndex;i<arrayLen;i++){
//            for(int j=i+1;j<arrayLen;j++){
//                if((array[i]^array[j])>target){
//                    count++;
//                }
//            }
//        }
        helpMMax=helpMax*2;
        int helpMMaxIndex=0;
        while(helpMMax<array[arrayLen-1]){
            helpMMaxIndex=Arrays.binarySearch(array,helpMaxIndex,arrayLen,helpMMax);
            count+=(arrayLen-helpMMaxIndex)*(helpMMaxIndex-helpMaxIndex);
            for(int i=helpMaxIndex;i<helpMMaxIndex;i++){
                for(int j=i+1;j<helpMMaxIndex;j++){
                    if((array[i]^array[j])>target){
                        count++;
                    }
                }
            }
            helpMax=helpMMax;
            helpMaxIndex=helpMMaxIndex;
            helpMMax*=2;   //可能发生溢出
        }
        for(int i=helpMaxIndex;i<arrayLen;i++){
            for(int j=i+1;j<arrayLen;j++){
                if((array[i]^array[j])>target){
                    count++;
                }
            }
        }
        return count;
    }
    public int solve1(int []array,int arrayLen,int target){
        int helpMax=1,helpMin=0,count=0;
        for(int i=0;i<32;i++){
            if(helpMax>target){
                break;
            }else{
                helpMax*=2;
            }
        }
        helpMin=helpMax/2;
        for(int i=0;i<arrayLen;i++){
            for(int j=i+1;j<arrayLen;j++){
                if(array[i]<helpMin && array[j]<helpMin)
                    continue;
                else if(array[i]<helpMax && array[j]>=helpMax ||
                        array[j]<helpMax && array[i]>=helpMax)
                    count++;
                else{
                    if((array[i]^array[j])>target)
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String []args){
        int arrayLen=scanner.nextInt();
        int target=scanner.nextInt();
        int []array=new int[arrayLen];
        for(int i=0;i<arrayLen;i++){
            array[i]=scanner.nextInt();
        }
        SolutionTT2 s2=new SolutionTT2();
        System.out.println(s2.solve(array,arrayLen,target));
        System.out.println(s2.solve1(array,arrayLen,target));
    }
}
