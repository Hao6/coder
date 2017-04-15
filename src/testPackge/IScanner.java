package testPackge;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by hongji on 2017/4/3.
 */
public class IScanner {
    Scanner scanner=new Scanner(System.in);
    //InputStreamReader jsr=new InputStreamReader(System.in); //与上一句是等效的操作
    public void inPut(){
        String str=scanner.next();  //空格以及回车被认为是休止符
        int number=scanner.nextInt();
        String []dataStr=str.split(",");
        int dataStrLen=dataStr.length;
        int []dataInt=new int[dataStrLen];
        int i=0;
        for(String temp:dataStr){
            dataInt[i++]=Integer.valueOf(temp);
        }
        for(i=0;i<dataStrLen;i++){
            System.out.println(dataInt[i]+"("+i+")");
        }
    }
    public static void main(String []args){
        IScanner iScanner=new IScanner();
        iScanner.inPut();
    }
}
