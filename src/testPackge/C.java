package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class C extends A {
    B b=new B();
    public C(){
        super(5);   //可以通过显式调用父类的构造器化解尴尬
        System.out.println("I am a C");
    }
    public static void main(String[] args) {
        C c=new C();
        System.out.println(c.i);
        c.i=67;
        c.printI();
        C c1=new C();
        System.out.println(c.i);  //子类完全隐士复制了父类的所有字段、方法，两者独立
    }
}
