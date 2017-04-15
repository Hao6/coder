package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/3.
 */
public class MainTask1Thread {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            new Thread(new Task1Print()).start();
        }
    }
}
