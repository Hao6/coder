package com.leetcoder.weekly36;

/**
 * Created by hao on 17-6-11.
 */
public class StringIterator {
    String compressedString;
    char curChar;   //当前字符
    int curCount;   //当前字符的迭代下标
    int curSumLen;  //当前字符的长度
    int curIndex;   //当前字符在字符串中的下标

    public StringIterator(String compressedString) {
        this.compressedString = compressedString;
        int compressedStringLen = compressedString.length();
        if (compressedStringLen == 0) {
            curIndex = 0;
            curChar = ' ';
            curCount = -1;
            curSumLen = 0;
        } else {
            curIndex = 0;
            curChar = compressedString.charAt(0);
            curCount = 0;
            for (int i = 1; i < compressedString.length(); i++) {
                if (compressedString.charAt(i) >= 'a' && compressedString.charAt(i) <= 'z'
                        || compressedString.charAt(i) >= 'A' && compressedString.charAt(i) <= 'Z') {
                    curSumLen = Integer.parseInt(compressedString.substring(1, i));
                    break;
                }
                if (i == compressedString.length() - 1) {
                    curSumLen = Integer.parseInt(compressedString.substring(1, i + 1));
                }
            }
        }
    }

    public char next() {
        if (curCount < curSumLen) {
            curCount++;
            return curChar;
        } else {
            if (hasNext() == true) {
                for (int i = curIndex + 1; i < compressedString.length(); i++) {
                    if (compressedString.charAt(i) >= 'a' && compressedString.charAt(i) <= 'z'
                            || compressedString.charAt(i) >= 'A' && compressedString.charAt(i) <= 'Z') {
                        curChar = compressedString.charAt(i);
                        curIndex = i;
                        curCount = 0;
                        for (int j = curIndex + 1; j < compressedString.length(); j++) {
                            if (compressedString.charAt(j) >= 'a' && compressedString.charAt(j) <= 'z'
                                    || compressedString.charAt(j) >= 'A' && compressedString.charAt(j) <= 'Z') {
                                curSumLen = Integer.parseInt(compressedString.substring(i + 1, j));
                                break;
                            }
                            if (j == compressedString.length() - 1) {
                                curSumLen = Integer.parseInt(compressedString.substring(i + 1, j + 1));
                            }
                        }
                        break;
                    }
                }
                curCount++;
                return curChar;
            } else {
                return ' ';
            }
        }
    }

    public boolean hasNext() {
        if (curCount < curSumLen)
            return true;
        for (int i = curIndex + 1; i < compressedString.length(); i++) {
            if (compressedString.charAt(i) >= 'a' && compressedString.charAt(i) <= 'z'
                    || compressedString.charAt(i) >= 'A' && compressedString.charAt(i) <= 'Z')
                return true;
        }
        return false;
    }
}
