package testPackge1;
import testPackge.*;
/**
 * Created by hongji on 2017/3/8.
 */
class Lettle1 {
    public int count;  //数量，公开
    String name;  //包可见
    protected String address;  //地址
    private String age;
    public Lettle1(int count,String name,String address,String age){
        this.count=count;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    Lettle1(){

    }
}
