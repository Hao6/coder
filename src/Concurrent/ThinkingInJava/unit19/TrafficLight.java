package Concurrent.ThinkingInJava.unit19;

import java.util.EnumSet;

/**
 * Created by hao on 17-5-2.
 */
enum Signal {
    RED,GREEN,YELLOW,
}
public class TrafficLight {
    Signal initSignal=Signal.RED;
    public void change(){
        switch (initSignal){
            case RED:
                initSignal=Signal.GREEN;
                break;
            case GREEN:
                initSignal=Signal.YELLOW;
                break;
            case YELLOW:
                initSignal=Signal.RED;
                break;
            default:
                initSignal=Signal.YELLOW;
                break;
        }
    }
    public String toString(){
        return "the current color is "+initSignal;
    }
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();
        for(int i=0;i<8;i++){
            System.out.println(trafficLight);
            trafficLight.change();
        }

    }

}
