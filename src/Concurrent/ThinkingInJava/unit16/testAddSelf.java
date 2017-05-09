package Concurrent.ThinkingInJava.unit16;

/**
 * Created by hao on 17-5-9.
 */
public class testAddSelf {
    public static void main(String[] args) {
        int i = 0, j = 0, z = 0;
         /*
         6: iload_1  ,将局部变量表中的第一个变量压入操作数栈
         7: iinc          1, 1 ,将局部变量表中的第一个变量自增一
         10: istore_1   ,操作数栈弹出，存入局部变量表中的第一个位置

         */
        i = i++; //总体上，i++先进入操作数栈，然后进行自增运算
       /*
       11: iinc          2, 1
       14: iload_2
       15: istore_2
        */
        j = ++j; //总体上，++j先进行自增运算，在入操作数栈
        z = (z++);
        System.out.println(i + " " + j + " " + z);
    }
}
