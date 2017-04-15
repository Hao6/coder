package com.leetcoder;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Created by hongji on 2017/4/14.
 */
public class Solution20 {  //无效的括号
    public boolean isValid(String s) {
        char leftParentheses='(';
        char leftBrackets='[';
        char leftBraces='{';
        char rightParentheses=')';
        char rightBrackets=']';
        char rightBraces='}';
        LinkedList<Character> help=new LinkedList<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(rightParentheses,leftParentheses);
        map.put(rightBrackets,leftBrackets);
        map.put(rightBraces,leftBraces);

        int sLen=s.length();
        for(int i=0;i<sLen;i++){
            if(s.charAt(i)==leftParentheses ||
                    s.charAt(i)==leftBrackets||s.charAt(i)==leftBraces){
                help.add(s.charAt(i));
            }else{
                if(help.isEmpty()==false){
                    char temp=help.pollLast();
                    if(map.get(s.charAt(i))!=temp){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        if(help.isEmpty()==false){
            return false;
        }else{
            return true;
        }
    }

}
