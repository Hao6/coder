package testPackge1;
import testPackge.*;

/**
 * Created by hongji on 2017/3/8.
 */
public class PostOffice1 {
    public int count;  //数量，公开
    String name;  //包可见
    protected String address;  //地址
    private String age;
    public PostOffice1(int count,String name,String address,String age){
        this.count=count;
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public static void main(String[] args) {
        PostOffice po=new PostOffice(2,"LH","75","21");
        System.out.println(po.count);   //跨包只能访问public

    }
}
