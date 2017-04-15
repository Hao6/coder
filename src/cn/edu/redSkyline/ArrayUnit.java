package cn.edu.redSkyline;


/**
 * 此类主要用于处理与数组处理有关的操作
 * @author Lh
 * Created by hongji on 2017/3/12.
 */
public class ArrayUnit{  //类泛型

    /**
     * 旋转数组,将给定长度的数组后端整体移动到前端，并保证被移动部分的顺序不变
     * @param intArr ,一维数组
     * @param count ，需要向前移的数量
     */
    private final static int NUMBER_EACH_LINES=20;    //每行打印的数据个数
    public static<T> void rotateArr(T []intArr,int count){
        int intArrLen=intArr.length;  //数组长度
        count=count%intArrLen;  //防止超出数组本身的长度
        if(count==0)
            return;  //啥都不做
        replaceArr(intArr,intArrLen-count,count);
        replaceArr(intArr,0,intArrLen-count); //一0下标起始，长度为intArrLen-count的数组部分
        replaceArr(intArr,0,intArrLen);
    }

    /**
     * 将给定区间上的一维数组首尾颠倒
     * @param intArr 一维数组
     * @param beginIndex 起始下标
     * @param length 颠倒部分的长度
     */
    public static<T> void replaceArr(T []intArr,int beginIndex,int length){
        int i=beginIndex,j=beginIndex+length-1;
        T temp;
        while(i<j){
            temp=intArr[i];
            intArr[i]=intArr[j];
            intArr[j]=temp;
            ++i;
            --j;
        }
    }

    /**
     * 依次遍历求得数组中的最小值
     * @param intArr 源数组
     * @return 数组中最小的元素值
     */
    public static<E extends Comparable> E getSmallest(E intArr[]) {  //静态方法泛型
        E temp=intArr[0];
       for(E data : intArr){
           if(data.compareTo(temp)<0){
               temp=data;
           }
       }
       return temp;
    }

    /**
     * 打印数组，每行20列
     * @param intArr，需要在控制台输出的数组
     */
    public static<T> void print(T intArr[]){
        int count=1;
        System.out.print("{");
        for(T temp:intArr){
            System.out.print(temp+" ");
            if(count++%NUMBER_EACH_LINES==0)
                System.out.println();
        }
        System.out.println("}");
    }
    public static<T> void changePosiOfTwoElements(T charArr[],int i,int j){
        //应该使用泛型编程，移到ArrUnit<T>这个类中去
        int charArrLen=charArr.length;
        if(i<0 || i>=charArrLen || j<0 || j>=charArrLen){
            throw new NullPointerException();
        }
        T temp=charArr[i];
        charArr[i]=charArr[j];
        charArr[j]=temp;
    }
}
