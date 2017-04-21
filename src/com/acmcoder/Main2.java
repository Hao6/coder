package com.acmcoder;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by hao on 17-4-18.
 */
public class Main2 {
    HashMap<Character,char[][]> help=new HashMap<>();
    static Scanner scanner=new Scanner(System.in);
    public void init(){
        char [][]zero={{'*','*','*',' ',' '},{'*',' ','*',' ',' '},
                {'*',' ','*',' ',' '},{'*',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('0',zero);

        char [][]two={{'*','*','*',' ',' '},{' ',' ','*',' ',' '},
                {'*','*','*',' ',' '},{'*',' ',' ',' ',' '},{'*','*','*',' ',' '}};
        help.put('2',two);

        char [][]three={{'*','*','*',' ',' '},{' ',' ','*',' ',' '},
                {'*','*','*',' ',' '},{' ',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('3',three);

        char [][]five={{'*','*','*',' ',' '},{'*',' ',' ',' ',' '},
                {'*','*','*',' ',' '},{' ',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('5',five);

        char [][]six={{'*','*','*',' ',' '},{'*',' ',' ',' ',' '},
                {'*','*','*',' ',' '},{'*',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('6',six);

        char [][]seven={{'*','*','*',' ',' '},{' ',' ','*',' ',' '},
                {' ',' ','*',' ',' '},{' ',' ','*',' ',' '},{' ',' ','*',' ',' '}};
        help.put('7',seven);

        char [][]eight={{'*','*','*',' ',' '},{'*',' ','*',' ',' '},
                {'*','*','*',' ',' '},{'*',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('8',eight);

        char [][]nine={{'*','*','*',' ',' '},{'*',' ','*',' ',' '},
                {'*','*','*',' ',' '},{' ',' ','*',' ',' '},{'*','*','*',' ',' '}};
        help.put('9',nine);

        char [][]one={{'*',' ',' '},{'*',' ',' '},{'*',' ',' '},{'*',' ',' '},{'*',' ',' '}};

        help.put('1',one);

        char [][]four={{'*',' ','*',' ',' '},{'*',' ','*',' ',' '},
                {'*','*','*',' ',' '},{' ',' ','*',' ',' '},{' ',' ','*',' ',' '}};
        help.put('4',four);

        char [][]add={{' ',' ',' ',' ',' '},{' ','*',' ',' ',' '},{'*','*','*',' ',' '},
                {' ','*',' ',' ',' '},{' ',' ',' ',' ',' '}};
        help.put('+',add);

        char [][]jian={{' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' '},{'*','*','*',' ',' '},{' ',' ',' ',' ',' '},{' ',' ',' ',' ',' '}};
        help.put('-',jian);

        char [][]mul={{' ',' ',' ',' ',' '},{'*',' ','*',' ',' '},{' ','*',' ',' ',' '},
                {'*',' ','*',' ',' '},{' ',' ',' ',' ',' '}};
        help.put('*',mul);

        char [][]chu={{' ',' ',' ',' ',' '},{' ',' ','*',' ',' '},{' ','*',' ',' ',' '},
                {'*',' ',' ',' ',' '},{' ',' ',' ',' ',' '}};
        help.put('/',chu);

        char [][]equal={{' ',' ',' ',' ',' ',' '},{'*','*','*','*',' ',' '},
                {' ',' ',' ',' ',' ',' '},{'*','*','*','*',' ',' '},{' ',' ',' ',' ',' ',' '}};
        help.put('=',equal);

        char [][]point={{' ',' ',' ',' '},{' ',' ',' ',' '},{' ',' ',' ',' '},
                {'*','*',' ',' '},{'*','*',' ',' '}};
        help.put('.',point);
    }

    public static void main(String[] args) {

        Main2 m2=new Main2();
        m2.init();

        int oop0=scanner.nextInt();
        char []sign=scanner.next().toCharArray();
        int oop1=scanner.nextInt();

        char []op0=String.valueOf(oop0).toCharArray();
        char []op1=String.valueOf(oop1).toCharArray();

        int result=0;
        switch(sign[0]){
            case '+':result=oop0+oop1;break;
            case '-':result=oop0-oop1;break;
            case '*':result=oop0*oop1;break;
            case '/':result=oop0/oop1;break;
        }
        char []resuArr=String.valueOf(result).toCharArray();
        for(int i=0;i<5;i++){
            //第一个运算数字
            for(int j=0;j<op0.length;j++){
                char [][]temp=m2.help.get(op0[j]);
                for(int z=0;z<temp[0].length;z++){
                    System.out.print(temp[i][z]);
                }
            }
            //符号
            char [][]ssign=m2.help.get(sign[0]);
            for(int z=0;z<ssign[0].length;z++){
                System.out.print(ssign[i][z]);
            }
            //第二个运算数字
            for(int j=0;j<op1.length;j++){
                char [][]temp=m2.help.get(op1[j]);
                for(int z=0;z<temp[0].length;z++){
                    System.out.print(temp[i][z]);
                }
            }
            //等号
            char[][] equal=m2.help.get('=');
            for(int z=0;z<equal[0].length;z++){
                System.out.print(equal[i][z]);
            }
            //结果
            for(int j=0;j<resuArr.length;j++){
                char [][]temp=m2.help.get(resuArr[j]);
                for(int z=0;z<temp[0].length;z++){
                    System.out.print(temp[i][z]);
                }
            }
            System.out.println();
        }
    }
}
