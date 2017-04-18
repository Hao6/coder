package com.acmcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by hao on 17-4-17.
 */
public class SolutionTouTiao1 {
    static Scanner scanner =new Scanner(System.in);

    public void insertSort(int array[],int lowerIndex,int highIndex){
        int temp;
        for(int i = lowerIndex+1;i<=highIndex;i++){
            for(int j=i;j>lowerIndex;j--){
                if(array[j]<array[j-1]){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
    public void quickSort(int []array,int lower,int higher){
        if(higher-lower<=100){
            insertSort(array,lower,higher);
            return;
        }

        int i=lower,j=higher;
        int tempData=array[lower];
        int tempData1=0;
        while(i<j){
            for(;j>=0;){
                if(array[j]>tempData)
                    j--;
                else
                    break;
            }
            for(;i<=lower;){
                if(array[i]<=tempData)
                    i++;
                else
                    break;
            }
            if(i>=j)
                break;
            tempData1=array[i];
            array[i]=array[j];
            array[j]=tempData1;
        }
        tempData1=array[lower];
        array[lower]=array[j];
        array[j]=tempData1;
        quickSort(array,lower,j-1);
        quickSort(array,j+1,higher);

    }
    public int solve(int []array,int arrayLen){
        //quickSort(array,0,arrayLen-1);
        Arrays.sort(array);
        int curHeadData=array[0];
        int count=0;
        for(int i=1;i<arrayLen;i++){
            if(i%3==0){
                curHeadData=array[i];
                continue;
            }
            if(array[i]-curHeadData>10){
                curHeadData+=10;
                count++;
            }else{
                curHeadData=array[i];
            }
        }
        int remainder=(count+arrayLen)%3;
        if(remainder!=0)
            count+=3-(count+arrayLen)%3;
        return count;
    }
    public static void main(String[] args){
        int arrayLen=scanner.nextInt();
        int []array=new int[arrayLen];
        for(int i=0;i<arrayLen;i++){
            array[i]=scanner.nextInt();
        }
        SolutionTouTiao1 s1=new SolutionTouTiao1();
        System.out.println(s1.solve(array,arrayLen));
    }
}
