package com.acmcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> inputs = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if(line != null && !line.isEmpty()) {
            int res = resolve(line.trim());
            System.out.println(String.valueOf(res));
        }
    }

    // write your code here
    public static int resolve(String expr) {
        String[] strArr = expr.split(" ");
        int ret = 0;
        int count = 0;
        String sign0 = "^";
        String sign1 = "+";
        String sign2 = "*";
        String no = "";
        List<Integer> help = new ArrayList<>();
        for (String data : strArr) {
            if (data.equals(sign0) == false && data.equals(sign1) == false &&
                    data.equals(sign2) == false && data.equals(no) == false) {
                help.add(Integer.parseInt(data));
                count++;
            } else if (data.equals(no) == true) {

            } else {
                if (data.equals(sign0) == true) {
                    if (count >= 1) {
                        int peekData = help.remove(count - 1);
                        help.add(++peekData);
                    } else {
                        return -1;
                    }
                } else if (data.equals(sign1) == true) {
                    if (count >= 2) {
                        int add0 = help.remove(count - 1);
                        int add1 = help.remove(count - 2);
                        help.add(add0 + add1);
                        count--;
                    } else {
                        return -1;
                    }
                } else {
                    if (count >= 2) {
                        int mul0 = help.remove(count - 1);
                        int mul1 = help.remove(count - 2);
                        help.add(mul0 * mul1);
                        count--;
                    } else {
                        return -1;
                    }
                }
            }
            if (count > 16) {
                return -2;
            }
        }
        return help.get(0);
    }
}

