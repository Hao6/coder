package Concurrent.ThinkingInJava.unit16;

import java.util.Arrays;
import java.util.List;

/**
 * Created by hao on 17-5-9.
 */
class BerylliumSphere{}
public class ArrayOptions {
    public static void main(String[] args) {
        BerylliumSphere []a;
        BerylliumSphere b[]=new BerylliumSphere[5];
        System.out.println("b :"+ Arrays.toString(b) );

        BerylliumSphere []c=new BerylliumSphere[4];
        for(int i=0;i<c.length;i++){
            if(c[i]==null)
                c[i]=new BerylliumSphere();
        }
        //聚集初始化,必须与声明一块执行，不能异地执行
        BerylliumSphere[] d = {new BerylliumSphere(),
                new BerylliumSphere()};

        //动态聚集初始化
        a=new BerylliumSphere[]{new BerylliumSphere(),new BerylliumSphere()};

//        d={new BerylliumSphere()};
//        testInit({new BerylliumSphere()});
        testInit(new BerylliumSphere[]{new BerylliumSphere()});
        ArrayOptions ao=new ArrayOptions();
        ao.testMultidimensionalArray();

    }
    public static void testInit(BerylliumSphere[] testArray){
        System.out.println("Hello??");
    }
    public BerylliumSphere[] getAArray(int n){
        return new BerylliumSphere[n];
    }
    //多维数组的初始化及声明
    public void testMultidimensionalArray(){
        int [][]da={{1,2},{2,3,4,4}};
        int db[][]={{1,2},{2,3,4,4},{1,2,3}};
//        System.out.println(Arrays.deepToString(db));
        int dc[][][]=new int[3][2][2];  //必须分配第一维的大小，其他随意
        int dd[][]=new int[][]{{1,2,6},{1,2,3}};

        Integer [][]de={{1,2,3},{3,4,5}};
        int [][]df={{new Integer(1),2,3},{3,4,5}};
        System.out.println(Arrays.deepToString(df));
        int []dg[]={{1},{2,6}};  //与数组名的位置无关
        int [][]dh[]={{{1}},{{1},{2}}};

    }
    //List<Integer> list[]=new List<Integer>[10];


}
