package testPackge;

/**
 * Created by hongji on 2017/3/9.
 */
abstract public class AbstractWriter {
    abstract void print();
    protected AbstractWriter(){
        print();  //调用的是实现类中的print()方法
    }
}
