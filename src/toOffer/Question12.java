package toOffer;

/**
 * Created by hongji on 2017/4/1.
 */
//按顺序（升序）打印【1，10^n-1】,最大的n位数
public class Question12 {
    //需要考虑大数溢出，所以需要用字符串或者字符数组表示数据
    public static void solve(int n) {
        StringBuilder maxValue = new StringBuilder();
        StringBuilder step = new StringBuilder("1");
        StringBuilder maxNum = new StringBuilder("9");

        for (int i = 0; i < n; i++) {
            maxValue.append(maxNum);
        }
        StringBuilder data = new StringBuilder("1");
        int count = 40;
        int i = 0;
        while (data.toString().equals(maxValue.toString())==false) {
            System.out.print(data + " ");
            if ((++i) % count == 0) {
                System.out.println();  //打印换行
                i = 0;
            }
            data = StrAddition1(data, step);
        }
        System.out.println(data);
    }

    //小端法
    public static StringBuilder StrAddition(StringBuilder str0, StringBuilder str1) {
        if (str0 == null || str1 == null)
            return null;
        int str0Len = str0.length();
        int str1Len = str1.length();

        StringBuilder ret = new StringBuilder();
        int remainderNum = 0; //当前的
        int curryNum = 0;
        int i;
        for (i = 0; i < str0Len && i < str1Len; i++) {
            char char0 = str0.charAt(i);
            char char1 = str1.charAt(i);
            remainderNum = (char0 - '0') + (char1 - '0') + curryNum;
            if (remainderNum < 10) {
                curryNum = 0;
            } else {
                remainderNum = remainderNum - 10;
                curryNum = 1;
            }
            ret.append(remainderNum);
        }
        StringBuilder tempStr = null;
        if (str0Len > str1Len) {
            tempStr = str0;
        } else if (str0Len < str1Len) {
            tempStr = str1;
        } else {
            if (curryNum != 0) {
                ret.append(curryNum);
            }
        }
        if (tempStr != null) {
            int tempStrLen = tempStr.length();
            for (; i < tempStrLen; i++) {
                char char0 = tempStr.charAt(i);
                remainderNum = (char0 - '0') + curryNum;
                if (remainderNum < 10) {
                    curryNum = 0;
                } else {
                    remainderNum = remainderNum - 10;
                    curryNum = 1;
                }
                ret.append(remainderNum);
            }
            if(curryNum!=0){
                ret.append(curryNum);
            }
        }
        return ret;
    }

    //大端法，低地址存储高位
    public static StringBuilder StrAddition1(StringBuilder str0, StringBuilder str1) {
        if (str0 == null || str1 == null)
            return null;
        int str0Len = str0.length();
        int str1Len = str1.length();

        StringBuilder ret = new StringBuilder();
        int remainderNum = 0; //当前的
        int curryNum = 0;
        int i = str0Len - 1, j = str1Len - 1;
        for (; i >= 0 && j >= 0; i--, j--) {
            char char0 = str0.charAt(i);
            char char1 = str1.charAt(j);
            remainderNum = (char0 - '0') + (char1 - '0') + curryNum;
            if (remainderNum < 10) {
                curryNum = 0;
            } else {
                remainderNum = remainderNum - 10;
                curryNum = 1;
            }
            ret.insert(0, remainderNum);
        }
        StringBuilder tempStr = null;
        int z = 0;
        if (str0Len > str1Len) {
            tempStr = str0;
            z = i;
        } else if (str0Len < str1Len) {
            tempStr = str1;
            z = j;
        } else {
            if (curryNum != 0) {
                ret.insert(0, curryNum);
            }
        }
        if (tempStr != null) {
            for (; z >= 0; z--) {
                char char0 = tempStr.charAt(z);
                remainderNum = (char0 - '0') + curryNum;
                if (remainderNum < 10) {
                    curryNum = 0;
                } else {
                    remainderNum = remainderNum - 10;
                    curryNum = 1;
                }
                ret.insert(0, remainderNum);
            }
            if(curryNum!=0)
                ret.insert(0, curryNum);
        }
        return ret;
    }


}
