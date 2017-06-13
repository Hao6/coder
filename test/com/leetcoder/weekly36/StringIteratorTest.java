package com.leetcoder.weekly36;

import junit.framework.TestCase;

/**
 * Created by hao on 17-6-11.
 */
public class StringIteratorTest extends TestCase {
    String str;
    StringIterator iterator;

    public void setUp() throws Exception {
        super.setUp();
        str = "x1y1z4f2t2r3";
        iterator = new StringIterator(str);
    }

    public void testH() throws Exception {
        System.out.println(iterator.next()); // return 'L'
        System.out.println(iterator.next()); // return 'e'
        System.out.println(iterator.next()); // return 'e'

        System.out.println(iterator.hasNext()); // return false


        System.out.println(iterator.next()); // return 't'
        System.out.println(iterator.next()); // return 'C'
        System.out.println(iterator.next()); // return 'o'
        System.out.println(iterator.next()); // return 'd'
        System.out.println(iterator.next()); // return 'd'
        System.out.println(iterator.next()); // return 'd'

        System.out.println(iterator.hasNext()); // return true

        System.out.println(iterator.next()); // return 'e'
        System.out.println(iterator.hasNext()); // return false
        System.out.println(iterator.next()); // return ' '
    }

}