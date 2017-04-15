package com.leetcoder;

import java.util.LinkedList;

/**
 * Created by hongji on 2017/4/11.
 */
public class Solution557 {
    public String reverseWords(String s) {
        StringBuilder ret=new StringBuilder();
        char charArr[]=s.toCharArray();
        int sLen=s.length();
        LinkedList<Character> help=new LinkedList<>();
        for(int i=0;i<sLen;i++){
            if(charArr[i]==' '){
                while(help.isEmpty()==false){
                    ret.append(help.pollLast());
                }
                ret.append(charArr[i]);
            }else{
                help.add(charArr[i]);
            }
        }
        while(help.isEmpty()==false){
            ret.append(help.pollLast());
        }
        return String.valueOf(ret);
    }
}
