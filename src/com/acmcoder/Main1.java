package com.acmcoder;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hao on 17-4-18.
 */
public class Main1 {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        Set<Long> numSet=new TreeSet<>();
        Long item;
        while(scanner.hasNextLong()==true){
            item=scanner.nextLong();
            if(item==0)
                break;
            numSet.add(item);
        }
        System.out.println(numSet.size());
    }

}
