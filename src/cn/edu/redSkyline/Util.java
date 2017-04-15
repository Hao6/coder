package cn.edu.redSkyline;

/**
 * Created by hongji on 2017/3/30.
 */
public class Util {
    public static final String charUpperSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String charLowerSet="abcdefghijklmnopqrstuvwxyz";
    public static final String numberSet="0123456789";  //十进制数字
    public static final String INT_MAX=String.valueOf(Integer.MAX_VALUE);
    public static final String INT_MIN=String.valueOf(Integer.MIN_VALUE).substring(1);


    public static void print(String str, int countOfBank, String bank) {
        StringBuilder outPut = new StringBuilder();
        for (int i = 0; i < countOfBank; i++) {
            outPut.append(bank);
        }
        outPut.append(str);
        System.out.println(outPut);
    }

    public static void printUserName(String functionName) {
        System.out.println();
        System.out.println("I am " + functionName);
    }

    public static void printDividingLine(int len) {
        assert (len > 0);
        System.out.println();
        for (int i = 0; i < len; i++) {
            System.out.print('+');
        }
        System.out.println();
    }
}
