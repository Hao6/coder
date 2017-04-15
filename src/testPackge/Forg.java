package testPackge;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by hongji on 2017/3/13.
 */
public class Forg extends Amphibian {
    public void print(){
        System.out.println("I am a Forg");
    }
    public A testFinal(A a){
        a=new A(1);
        System.out.println(a);
        return a;
    }
    //@Override  //无法重写private方法
//    public void printHello(){
//        System.out.println("I am a Forg, Hello!");
//    }
//    @Override  //无法重写final方法
//    public void printData(){
//        System.out.println("Data for Forg");
//    }
    public static void main(String[] args) {
        Amphibian amphibian=new Forg();
        amphibian.print();
        amphibian.printData();
        amphibian.printHi();
        System.out.println(A.sign);
        //A a=new A(2);
//        Forg forg=new Forg();
//        System.out.println(a);
//        A b=forg.testFinal(a);
//        System.out.println(b);
        //System.out.println(a.equals(b));
        DecimalEnum decimalEnum=DecimalEnum.ZERO;
        DecimalEnum decimalEnum1=DecimalEnum.ZERO;
        System.out.println(decimalEnum.equals(decimalEnum1));

    }
}
