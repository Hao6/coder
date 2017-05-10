package Concurrent.ThinkingInJava.unit14;

import java.util.Arrays;

/**
 * Created by hao on 17-5-10.
 */
class Sky{
    public String str;
    private String str1;
}
class SonOfSky extends Sky{
    public int i;
}
class Flys extends SonOfSky{
    public boolean b0;
    public boolean b1;
}
public class Exercise8 {
    public static void printInheritanceSystemInfo(Object o) {
        if (o == null)
            return;
        try {
            if(o.getClass().getSuperclass()!=null)
                printInheritanceSystemInfo(o.getClass().getSuperclass().newInstance());
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(o.getClass().getSimpleName()+" "+
                Arrays.toString(o.getClass().getDeclaredFields()));
    }
    public static int charArrayIsInstance(char [] charArr){
        if(charArr!=null){
            return charArr.getClass()!=null ? 1:-1;
        }
        return 0;
    }
    public static void main(String []args){
        Flys fly=new Flys();
        printInheritanceSystemInfo(fly);
        char []charArr=new char[1];
        System.out.println("char[] is a instance " +charArrayIsInstance(charArr));
        new Integer(1).getClass();
    }
}
