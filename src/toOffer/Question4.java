package toOffer;

import java.util.Random;

/**
 * Created by hongji on 2017/3/8.
 */
public class Question4 {
    private char sour[];
    String substituteStr="%20";    //替换字符串
    char substituteChar=' ';
    int sourLen;  //当前使用长度
    int destiLen;  //实际已分配长度
    public Question4(int sourLen,int destiLen){
        this.sourLen=sourLen;
        this.destiLen=destiLen;
        sour=new char[destiLen];   //实际长度
        init();
    }
    void init(){  //初始化字符串数组
        String dataString="abc defghijk lmn opqrstu vwxyz123456";  //数据集
        int dataLen=dataString.length();
        Random random=new Random();
        sour[0]=' ';
        for(int i=1;i<sourLen;i++){
            sour[i]=dataString.charAt(random.nextInt(dataLen-1));
        }
    }
    public void substituteChar(){    //默认为空格替换为“%20”
        int countSpace=0;
        int idealCount=0;
        for (char temp : sour){
            if(temp==0)
                break;
            else if(temp==substituteChar)
                ++countSpace;
        }
        idealCount=2*countSpace+sourLen;
        if(idealCount>destiLen){
            System.out.println("数组初始长度不够");
            return;
        }
        //否则，开始替换
        int p=idealCount-1;   //替换后的尾部
        int p1=sourLen-1;    //替换前的尾部
        while(p1>=0){
            if(sour[p1]!=' '){
                sour[p--]=sour[p1--];   //直接复制
            }else{   //sour[p1]==' '
                int strLen=substituteStr.length();
                for(int i=0;i<strLen;i++){
                    sour[p--]=substituteStr.charAt(strLen-1-i);
                }
                --p1;
            }
        }
    }
public static void main(String[] args) {
    Question4 q4=new Question4(30,50);
    System.out.println(String.valueOf(q4.sour));
    q4.substituteChar();
    System.out.println(String.valueOf(q4.sour));

}
}
