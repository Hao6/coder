package Concurrent.ThinkingInJava.unit19;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by hao on 17-5-2.
 */

import static Concurrent.ThinkingInJava.unit19.AlarmPoints.*;

public class EnumSets {
    public static void main(String[] args) {
        //创建了一个新的空EnumSet
        EnumSet<AlarmPoints> points=EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM); //添加元素
        points.addAll(EnumSet.of(STAIR1,STAIR2,KITCHEN));


    }
}
