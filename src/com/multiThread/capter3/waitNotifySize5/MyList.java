package com.multiThread.capter3.waitNotifySize5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hao on 17-6-2.
 */
public class MyList {
    private static List<String> myList=new ArrayList();

    public static void add(){
        myList.add("anyThing");
    }

    public static int size(){
        return myList.size();
    }
}
