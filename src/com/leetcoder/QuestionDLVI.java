package com.leetcoder;

/**
 * Created by hongji on 2017/4/10.
 */
public class QuestionDLVI {
    public int nextGreaterElement(int n) {
        if (n <= 0) {
            return -1;
        }
        String data = String.valueOf(n);
        int dataLen = data.length();
        int ret = 0;
        StringBuilder retStr = null;
        int i = 0;
        for (i = dataLen - 1; i > 0; i--) {
            if (data.charAt(i) > data.charAt(i - 1)) {
                retStr = new StringBuilder();
                break;
            }
        }
        if (retStr == null) {
            return -1;
        } else {
            int tempIndex = i, tempMinIndex = i;
            for (int j = i; j < dataLen; j++) {
                if (data.charAt(j) > data.charAt(i - 1)) {
                    tempIndex = j;
                    if (data.charAt(tempIndex) < data.charAt(tempMinIndex)) {
                        tempMinIndex = tempIndex;
                        //break;   //找到了第一个比i-1位置大的字符中最小的一个的字符下标
                    }
                }
            }
            retStr.append(data.substring(0, i - 1));
            retStr.append(data.charAt(tempMinIndex));
            retStr.append(data.substring(i,tempMinIndex));
            retStr.append(data.charAt(i - 1));
            if (tempMinIndex + 1 < dataLen)
                retStr.append(data.substring(tempMinIndex + 1, dataLen));
            //将ret【i,dataLen-1】之间的数字升序排序
            int []array=new int[10];
            for(int z=i;z<dataLen;z++){
                array[retStr.charAt(z)-'0']++;  //简单哈希，桶排序
            }
            retStr=retStr.delete(i,dataLen);
            for(int z=0;z<10;z++){
                for(int zz=0;zz<array[z];zz++){
                    retStr.append(z);
                }
            }
        }
        if (isOverflow(String.valueOf(retStr))==false) {
            ret = Integer.valueOf(String.valueOf(retStr));
        }else{
            ret=-1;
        }
        return ret;
    }

    public boolean isOverflow(String str) {
        String INT_MAX = String.valueOf(Integer.MAX_VALUE);
        if (str.length() > INT_MAX.length() || str.length() == INT_MAX.length() &&
                str.compareTo(INT_MAX) > 0) {
            return true;
        }
        return false;
    }
}
