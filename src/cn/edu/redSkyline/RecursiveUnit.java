package cn.edu.redSkyline;


import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.List;

/**
 * 一些递归算法的实例
 * Created by hongji on 2017/3/13.
 */
public class RecursiveUnit {
    /**
     * 打印数组charArr中所有元素的全排列
     */


    public static <T> void printFullArrangement(T charArr[], int i, int n) {
        assert(charArr!=null);  //断言
        int j;
        if (i == n) {
            ArrayUnit.print(charArr);//打印数组
        } else {
            gotoFor:
            for (j = i; j <= n; j++) {
                int flag = 1;
                for (int r = i; r < j; r++) {
                    if (charArr[r] == charArr[j]) {
                        continue gotoFor;  //跳到最外层的循环继续执行
                    }
                }
                ArrayUnit.changePosiOfTwoElements(charArr, i, j);
                printFullArrangement(charArr, i + 1, n);
                ArrayUnit.changePosiOfTwoElements(charArr, i, j);
            }
        }
    }

    public static<T> void printFullNum(T charArr[],T source[],int n) {
        assert(charArr!=null);  //断言
        if (n <= 0) {
            return;
        }
        if (n == 1) {
            for (T temp : source) {
                charArr[0] = temp;
                ArrayUnit.print(charArr);
            }
            return;
        } else {
            for (T temp : source) {
                charArr[n - 1] = temp;   //高位存在了相对的数组高地址处
                printFullNum(charArr, source,n - 1);
            }
        }
    }

    public static<T> void printFullNum1(T charArr[],T []source, int i, int n) {
        assert(charArr!=null);  //断言
        if (i > n) {
            return;
        }
        if (i == n) {
            for (T temp : source) {
                charArr[n] = temp;
                ArrayUnit.print(charArr);
            }
            return;
        } else {
            for (T temp : source) {
                charArr[i] = temp;   //高位存在了相对的数组低地址处
                printFullNum1(charArr,source ,i + 1, n);
            }
        }
    }

    public static <T> void subset(int n,T []str){
        assert (str!=null);
        for(int i=0;i<(1<<n);i++){  //当n>32时，就会发生int类型溢出，不过至少2^32种组合，
            // 非常大的数量级，遇到的可能性暂时不大
            printFullCombination(n,i,str);   //2^n种可能
        }
    }


    public static <T> void printFullCombination(int n, int s,T []str) {
        System.out.print("{");
        for (int i = 0; i < n; i++) {
            if ((s & (1 << i)) != 0)
                System.out.print(str[i] + " ");
        }
        System.out.print("}\n");
    }
    public static<T> void useCombination1(LinkedList<T>resultArr,T []str){
        assert (str!=null);
        assert (resultArr!=null);
        for(int i=0;i<=str.length;i++){
            printFullCombination1(resultArr,str,i,0);
        }
    }
    public static<T> void printFullCombination1(LinkedList<T>resultArr,T []str,int number,
                                               int curIndexOfSource){
        if(number==0){
            CollectionUnit.printCollection(resultArr);
            return;
        }
        if(curIndexOfSource>=str.length){
            return;
        }
        resultArr.add(str[curIndexOfSource++]);
        printFullCombination1(resultArr,str,number-1,curIndexOfSource);
        resultArr.pollLast();  //删除最后一个，如果List为空，则返回null
        printFullCombination1(resultArr,str,number,curIndexOfSource);
    }


    public static void main(String[] args) {
        Character[] source = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
//        Character[] charArr = {'a', 'a', 'b', 'c', 'c'};
//        int charArrLen = charArr.length;
//
//        printFullArrangement(charArr, 0, charArrLen - 1);
//            Character []charArr=new Character[]{};  //长度==0
//        //printFullNum(charArr,charArr.length);
//        printFullNum1(charArr,0,charArr.length-1);
        Character []str={'a','b','c','d'};
        //subset(str.length,str);
        LinkedList<Character> result=new LinkedList<>();
        useCombination1(result,str);
    }
}
