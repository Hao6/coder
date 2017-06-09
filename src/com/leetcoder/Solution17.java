package com.leetcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hongji on 2017/6/9.
 */
public class Solution17 {
    public List<String> letterCombinations(String digits) {
        List<String> ret=new ArrayList<>();
        if(digits.contains("0") || digits.contains("1") || digits.length()==0)
            return ret;
        Map<Character,String> help=new HashMap<>();
        help.put('2',"abc");
        help.put('3',"def");
        help.put('4',"ghi");
        help.put('5',"jkl");
        help.put('6',"mno");
        help.put('7',"pqrs");
        help.put('8',"tuv");
        help.put('9',"wxyz");
        StringBuilder str=new StringBuilder("");
        getCombinations(ret,help,digits,str,0);
        return ret;
    }
    private void getCombinations(List<String> combinations,Map<Character,String > help,
                                 String digits,StringBuilder temp,int count){
        if(count==digits.length()){
            combinations.add(temp.toString());
            return;
        }
        char curDigit=digits.charAt(count);
        char[] curStr2CharArr=help.get(curDigit).toCharArray();
        for(char c:curStr2CharArr){
            getCombinations(combinations,help,digits,temp.append(c),count+1);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}
