package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class Cup {
    Cup(int marker){
        System.out.println("Cup("+marker+")");
    }
    int []barr={1,2,3};
    int []arrb=new int[]{1,2,3}; //=右边的int与[]顺序不可以颠倒，左边的正好可以
    void f(int marker){
        System.out.println("f("+marker+")");
    }
    public static  void main(String... args){
        for(String temp :args){
            System.out.println( temp);
        }
    }
}
