package testPackge1;

import testPackge.*;

/**
 * Created by hongji on 2017/3/8.
 */
public class Posters extends PostOffice {  //跨包继承只能使用public默认构造函数了
    public Posters(){

    }

    public static void main(String[] args) {
        Posters posters=new Posters();
        posters.address="hj";
        posters.count=89;
    }
}
