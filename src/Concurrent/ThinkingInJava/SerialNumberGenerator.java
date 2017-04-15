package Concurrent.ThinkingInJava;

/**
 * Created by hongji on 2017/4/4.
 */
public class SerialNumberGenerator {
    private static volatile int serialNumber=0;
    public static synchronized int nextSerialNumber(){
        return serialNumber++;
    }
}
