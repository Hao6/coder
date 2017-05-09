package Concurrent.ThinkingInJava.unit16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hao on 17-5-9.
 */
public class testArraysFuncs {
    static int a[]=new int[3];
    static int b[]=new int[3];
    static int c[]=new int[4];
    static Integer d[]=new Integer[]{4,7,3,2,4,5,7};


    public static void main(String[] args) {
        Arrays.fill(a,1);
        Arrays.fill(b,0);
        Arrays.fill(c,1);
        System.out.println("Array a equals with Array b: "+Arrays.equals(a,b));
        System.out.println("Array a equals with Array c: "+Arrays.equals(a,c));
        Arrays.sort(d);
        Arrays.binarySearch(d,8);
        Arrays.binarySearch(d,0,7,8);
        List<Integer> ret=Arrays.asList(1,2,3,34,4,4);
        System.out.println("preheat copy");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
        System.arraycopy(a,1,d,2,2);
        System.out.println("after copy");
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
    }

}
