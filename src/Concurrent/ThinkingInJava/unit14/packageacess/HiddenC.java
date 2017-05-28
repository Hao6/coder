package Concurrent.ThinkingInJava.unit14.packageacess;

/**
 * Created by hao on 17-5-11.
 */
class C implements A{

    @Override
    public void f() {
        System.out.println("public C.f()");
    }
    public void g() {
        System.out.println("public C.g()");
    }
    void u(){
        System.out.println("Package C.u()");
    }
    protected void v(){
        System.out.println("protected C.v()");
    }
    private void w(){
        System.out.println("private C.w()");
    }

}
public class HiddenC {
    public static A makeA(){
        return new C();
    }
}
