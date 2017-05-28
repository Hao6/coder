package Concurrent.ThinkingInJava.unit11;

/**
 * Created by hao on 17-5-11.
 */
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
public class exam15 {
    static Scanner scanner=new Scanner(System.in);
    static Stack<Character> stack=new Stack<>();
    public static void main(String []args){
        String str=scanner.next();
        char []str2Char=str.toCharArray();
        int strLen=str.length();
        for(int i=0;i<strLen;i++){
            if(str2Char[i]=='+'){
                stack.push(str2Char[++i]);
            }
            else if(str2Char[i]=='-'){
                System.out.print(stack.pop());
            }
        }
    }

}
