package testPackge;

import java.util.Collection;
import java.util.Stack;

/**
 * Created by hongji on 2017/3/8.
 */
public class Poster extends PostOffice{   //父类的无参数构造函数只要能被子类访问即可，即public,default,protected
    public static void main(String[] args) {
        PostOffice po=new PostOffice(2,"LH","75","21");
        System.out.println(po.count+" "+po.address+" "+po.name); //继承之后，private不能访问
    }


}
