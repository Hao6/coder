package Concurrent.ThinkingInJava.unit11;

import java.util.*;

/**
 * Created by hao on 17-5-11.
 */
public class AddingGroup {
    public static void main(String[] args) {
        Collection<Integer> collection=
                new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer []moreInts={6,7,8,9};
        collection.addAll(Arrays.asList(moreInts));

        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);

        List<Integer> list=Arrays.asList(16,17,18,19);
        int []a=new int[]{1,2,3};

        List<? extends int[]> listA=Arrays.asList(a);
        List<?> listB=Arrays.asList(1,5.5,5.5,new Animal("nimal"));
        list.set(1,99);
    }
}
