package Concurrent.ThinkingInJava.unit12;

/**
 * Created by hao on 17-5-8.
 */
class Exception1 extends java.lang.Exception{

}
class Exception2 extends java.lang.Exception{

}
class Exception3 extends java.lang.Exception{

}
class Base {
    private String showMe() {
        return "Base";
    }

    public void print() {
        System.out.println(showMe());
        showMe();
    }

    public Base() throws Exception1,Exception2{
    }
}

public class Sub extends Base {
    public String showMe() {
        return "Sub";
    }

    public Sub() throws Exception1,Exception2,Exception3{
    }

    public static void main(String args[]) {
        try {
            Sub sub = new Sub();
            sub.print();
        }catch (Exception1 e){

        }catch (Exception2 e){

        }catch (Exception3 e){

        }
        //System.out.println(sub.showMe());
    }
}
