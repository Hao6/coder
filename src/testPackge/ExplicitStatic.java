package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("inside main");
//        Cups cups1=new Cups();
//        Cup tempCup=Cups.cup1;
//        tempCup.f(99);
        Cup.main();
    }

//    static Cups cups2=new Cups();
}
