package Concurrent.ThinkingInJava.unit14;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * Created by hongji on 2017/5/10.
 */
//一个.java可以包括一个或者不包括一个public顶级类,当不包括顶级类时，可以不包括
// 同名的类，但若是包括一个public类，则必须与文件名一致
//类方法提取器
class PackageClass{
    public void print(){
        System.out.println("I am a PackageClass");
    }
}
public class ShowMethods {
    private static String usage=
            "Usage:\n"+
                    "ShowMethods qualified.class.name\n"+
                    "To show all metjods in class or:\n"+
                    "ShowMethods qualified.class.name word\n"+
                    "To search for methods involving 'word'";
    private static Pattern p=Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        if(args.length<1){
            System.out.println(usage);
            System.exit(1);
        }
        int lines=0;
        try {
            Class<?> c=Class.forName(args[0]);
            Method[] methods=c.getMethods();
            Constructor[] ctors=c.getConstructors();
            if(args.length==1){
                for(Method method:methods){
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                }
                for(Constructor ctor:ctors){
                    System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                }
                lines=methods.length+ctors.length;
            }else{
                for(Method method:methods){
                    if(method.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                    }
                    lines++;
                }
                for(Constructor ctor:ctors){
                    if(ctor.toString().indexOf(args[1])!=-1){
                        System.out.println(p.matcher(ctor.toString()).replaceAll(""));
                    }
                    lines++;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("no suach class");
            e.printStackTrace();
        }
    }
    class InnerClass{
        public void print(){
            System.out.println("I am a innerClass");
        }
    }

}
