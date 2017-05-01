package com.acmcoder;

/**
 * Created by hongji on 2017/4/29.
 */

import cn.edu.redSkyline.ArrayUnit;

/**
 * 给定一个只有非负整数的数组，将数组中所有的0元素移到数组的头部，而非零元素的顺序保持不变
 * 解决思路是
 */
public class InterviewSolution1 {
    public void solve(int[] array) {
        if (array == null)
            return;
        int arrayLen = array.length;
        if (arrayLen == 0 || arrayLen == 1)
            return;
        int zeroIndex0 = -1, zeroIndex1 = -1, noZeroIndex0 = -1, noZeroIndex1 = -1;
        for (int i = arrayLen - 1; i >= 0; i--) {
            if (array[i] == 0) {
                zeroIndex0 = i;
                zeroIndex1 = i;
                for (int j = i - 1; j >= 0; j--) {
                    if (array[j] == 0) {
                        zeroIndex0 = j;
                    } else {
                        noZeroIndex0 = j;
                        noZeroIndex1 = j;
                        for (int z = noZeroIndex0 - 1; z >= 0; z--) {
                            if (array[z] != 0) {
                                noZeroIndex0 = z;
                            } else {
                                break;
                            }
                        }
                        //[n0,n1]与[z0,z1]发生交换
                        swapSequence(array, noZeroIndex0, noZeroIndex1, zeroIndex0, zeroIndex1);
                        int tempZero0=zeroIndex0;
                        zeroIndex0=noZeroIndex0;
                        zeroIndex1=zeroIndex1-tempZero0+zeroIndex0;
                        j=noZeroIndex1-2;
                    }
                }
            }
        }
    }

    public void swapSequence(int[] array, int n0, int n1, int z0, int z1) {
        swapElement(array,n0,n1);
        swapElement(array,z0,z1);
        swapElement(array,n0,z1);
    }
    public void swapElement(int []array,int n0,int n1){
        int i=n0,j=n1;
        int temp=0;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }

}

