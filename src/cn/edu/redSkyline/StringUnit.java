package cn.edu.redSkyline;

/**
 * Created by hongji on 2017/3/12.
 */

/** 用来实现某些字符串函数
 * @author Lh
 */
public class StringUnit {
    public static int charCount(String str,char target){
        char str2CharArr[]=str.toCharArray();
        int count=0;
        for(char temp:str2CharArr){
            if(temp==target)
                ++count;
        }
        return count;
    }
}
