package noCoder;

import java.util.Random;

/**
 * Created by hongji on 2017/3/28.
 */
//牛客网，完美洗牌算法
public class washPoker {
    static Random random=new Random();
    public static<T> void solve(T []array){
        int arrayLen=array.length;
        T temp;
        char a='中';    //在c中是错误的，java默认使用GBK编码存储
        int replacement;
        //int 刘=2324;     //中文可以作为变量名
        for(int i=0;i<arrayLen-1;i++){
            replacement=i+random.nextInt(arrayLen-i);
            temp=array[replacement];
            array[replacement]=array[i];
            array[i]=temp;
        }
    }

    public static void main(String[] args) {
        Integer []Array={1,2,4,5};
        solve(Array);   //侧面证明main()函数是个static函数
    }
}
