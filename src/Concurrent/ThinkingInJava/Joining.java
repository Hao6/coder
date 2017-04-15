package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public class Joining {
    public static void main(String []args){
        Sleeper
                sleep=new Sleeper("Sleepy",30),
                grumpy=new Sleeper("grumpy",30);
        Joiner
                dopey=new Joiner("Dopey",sleep),
                doc=new Joiner("doc",grumpy);
        grumpy.interrupt();  //grumpy被中断
    }
}
