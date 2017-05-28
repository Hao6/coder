package Concurrent.ThinkingInJava.unit14;

import Concurrent.ThinkingInJava.unit14.packageacess.*;
import java.lang.reflect.*;


/**
 * Created by hao on 17-5-11.
 */
public class HiddenImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A a= HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());
//        if(a instanceof C){  //由于C的包访问权限，此处无法直接访问C,a也无法直接调用C的方法
//
//        }
        callHiddenMethod(a,"g");
        callHiddenMethod(a,"u");
        callHiddenMethod(a,"v");
        callHiddenMethod(a,"w");

    }
    //通过反射获取基本类型后，通过反射调用隐藏的方法
    static void callHiddenMethod(Object a,String methodName)
            throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method g=a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }
    //javap -private C,反编译器，用来查看字节码文件的原始.java文件的主要信息，包括private
}
