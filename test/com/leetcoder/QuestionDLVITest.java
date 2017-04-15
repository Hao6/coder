package com.leetcoder;

import junit.framework.TestCase;

/**
 * Created by hongji on 2017/4/10.
 */
public class QuestionDLVITest extends TestCase {
    int n;
    QuestionDLVI q556;
    public void setUp() throws Exception {
        super.setUp();
        n=198765432;
        q556=new QuestionDLVI();
    }

    public void testNextGreaterElement() throws Exception {
        assertEquals(213456789,q556.nextGreaterElement(n));
    }

}