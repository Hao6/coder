package Concurrent.ThinkingInJava.unit2;

/**
 * Created by hongji on 2017/4/28.
 */
//使用Integer对象的各种属性及方法
public class IntegerIns {
    Integer a=-1090;
    boolean bool;
    char ch;
    byte by;
    short sh;
    int i;
    long lo;
    float fl;
    double dou;

    public final void run(){
        System.out.println(a.byteValue());  //通过截取低八位的形式得到一个有符号byte
        System.out.println(a.compareTo(5));
        System.out.println(a.doubleValue());
        System.out.println(a.equals(-1090));
        System.out.println(a.floatValue());
        System.out.println(a.longValue());
        System.out.println(a.shortValue());
        System.out.println(a.toString());
        System.out.println(a.intValue());
    }
    public static void staticRun(){
        Integer a,b;
        for(int i=-129;i<129;i++){
            a=i;
            b=i;
            System.out.print((a==b)+" ");
            if (i%20==0){
                System.out.println();
            }
        }
    }

    public static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n;
    }
    public static void testBoxing(){
        Integer a = 100;
        Integer b = 200;
        Integer c = 300;
        Integer d = 3;
        Integer e = 321;
        Integer f = 321;
        int i=300;
        Long g = 300L;
        Long h = 2L;

        System.out.println(c>d);
        System.out.println(e==f);
        System.out.println(c==(a+b));
        System.out.println(c.equals(a+b));
        System.out.println(g==(a+b));
        System.out.println(g.equals(a+b));  //equals方法会先判断传入的对象是否是Long类型的实例，
        // 而（a+b）是Integer类型的实例
        System.out.println(g.equals(a+h));  //a+h由于其中一个是long，相加时会进行类型提升，变成
        // long+long---->long这种情况
        System.out.println(i==g);
    }
    public static void staticFunTest(){
        Integer a=178;
        Integer b=125;
        Integer.bitCount(a);
        Integer.compare(a,b);
    }

    public static void main(String[] args) {
//        IntegerIns ins=new IntegerIns();
//        ins.run();
        IntegerIns ins=new IntegerIns();
        //ins.testBoxing();
//        System.out.println("initialization bool: "+ins.bool+
//                " initialization char: "+ins.ch+
//                " initialization byte: "+ins.by+
//                " initialization short: "+ins.sh+
//                " initialization int: "+ins.i+
//                " initialization float: "+ins.fl+
//                " initialization double: "+ins.dou
//        );
//        System.out.println(ins.bool==false);
        System.out.println(ins.tableSizeFor(1048576-1));
    }
}
