package testPackge;

import java.util.*;

/**
 * Created by hongji on 2017/3/9.
 */
public class Writer extends AbstractWriter {
    String data="89";
    void print(){
        System.out.println(data);
    }
    static  void printHello(){
        System.out.println("Hello");
    }


    public static void main(String[] args) {
        for(String temp:args){
            System.out.println(temp);
        }
        List<Integer> li=Arrays.asList(1,2,3);   //奇怪的逻辑，得到了一个接口的引用
        Collection<Integer> collection=new ArrayList<Integer>(li);
        printHello();
        Writer wr=new Writer();
        wr.print();
        wr.printHello();
        System.out.println(li.size());
        System.out.println(li.getClass().getName());
        Long []arr=new Long[]{1l,4l,5l};

        System.out.println("arr = " + arr.getClass());
//        PrintStream OUT=new PrintStream(System.out);   //System.out.println的实质
//        OUT.println("Hellio");
    }
}
