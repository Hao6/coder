package testPackge;
//import testPackge1.*;
/**
 * Created by hongji on 2017/3/8.
 */
public class PostOffice {
    public int count;  //数量，公开
    String name;  //包可见
    protected String address;  //地址
    private String age;
//    PostOffice(){   //用于同包
//
//    }
    public PostOffice(){

    }
    public PostOffice(int count,String name,String address,String age){
        this.count=count;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public static void main(String[] args) {
        Lettle le=new Lettle(12,"hk","89","23");
        System.out.println(le.count+" "+le.address+" "+le.name);   //目前还未发现类的默认修饰符的作用
        //Lettle1 le1=new Lettle1(12,"hk","89","23");  //刚刚发现，在其他类中该类不可见，
        // 但是IDE会报告错误non-public，而不是不存在
        int i=-1;
        System.out.println(Integer.toBinaryString(i));
        i>>>=10;
        System.out.println(Integer.toBinaryString(i));
        long j=-1;
        System.out.println(Long.toBinaryString(j));
        j>>>=10;
        System.out.println(Long.toBinaryString(j));
        byte z=-1;
        System.out.println(Integer.toBinaryString(z));

        System.out.println(Integer.toBinaryString(z>>>10));
        z>>>=10;
        System.out.println(Integer.toBinaryString(z));
        short a=0x7fff;
        short b=5;
        short c=(short)(a+b);   //short,byte,char类型的算术运算都会提升到int类型进行计算
        System.out.println(c);

    }
}
