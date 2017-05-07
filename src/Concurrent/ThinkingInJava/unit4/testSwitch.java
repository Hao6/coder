package Concurrent.ThinkingInJava.unit4;

import cn.edu.redSkyline.Util;

/**
 * Created by hao on 17-5-2.
 */
public class testSwitch {
    //对switch的特性进行测试
    public void Switch(int a){
        switch (a){
            case 1:
                System.out.println("I am "+a);
                break;
            case 2:
                System.out.println("I am "+a);
                break;
            case 3:
                System.out.println("I am "+a);
                //continue;   事实验证continue不能用于纯switch
                return;   //在逻辑上，return与break具有相同的功能
            case 4:
                System.out.println("I am "+a);
                break;
            default:
                System.out.println("default");   //只有在没有执行任何case后语句的情况下，才会执行default
        }

    }
    public void Switch1(int a){
        switch (a){
            case 1:
                System.out.println("I am "+a++);
            case 2:
                System.out.println("I am "+a++);
            case 3:
                System.out.println("I am "+a++);
                //continue;   事实验证continue不能用于纯switch
                return;   //在逻辑上，return与break具有相同的功能
            case 4:
                System.out.println("I am "+a);
                break;
            default:
                System.out.println("default");
        }

    }
    public void Switch2( int a) {
        switch (a) {
            case 1:
                System.out.println("I am " + a++);
            case 2:
                System.out.println("I am " + a++);
            case 3:
                System.out.println("I am " + a++);
            case 4:
                System.out.println("I am " + a);
            default:
                System.out.println("default");   //只有在没有执行任何case后语句的情况下或者没有break\return，才会执行default
        }
    }
    public void Switch3(int []array){
        for(int i=0;i<array.length;i++){
            switch (array[i]) {
                case 4:
                    System.out.println("I am " + array[i]);
                case 1:
                    System.out.println("I am " + array[i]);
                    break;
                case 2:
                    System.out.println("I am " + array[i]);
                    continue;  //此处的continue的作用对象是for循环，也普通的continue作用一致
                case 3:
                    System.out.println("I am " + array[i]);
                    //return;   //return会终结整个程序，保持它一贯的作风
                default:
                    System.out.println("default");
                    continue;
            }
            Util.printDividingLine(30);
        }

    }
}
