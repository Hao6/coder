package testPackge;

import java.util.Comparator;

/**
 * Created by hongji on 2017/3/12.
 */
public class A {
    int i=34;
    public static String sign="Class A";
    public A() {
    }

    public A(int sign){
        System.out.println("I am a A"+" "+i); //子类调用父类的构造函数时（显式or隐式），与在父类中
        // 直接调用发生的一切全都一样，先初始化字段，最后执行构造函数
    }
    public void printI(){
        System.out.println(i);
    }
}
