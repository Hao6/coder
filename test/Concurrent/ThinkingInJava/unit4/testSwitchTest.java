package Concurrent.ThinkingInJava.unit4;

import junit.framework.TestCase;

/**
 * Created by hao on 17-5-2.
 */
public class testSwitchTest extends TestCase {
    testSwitch tSwitch;
    int temp;
    int []array;
    public void setUp() throws Exception {
        super.setUp();
        tSwitch=new testSwitch();
        temp=1;
        array=new int[]{0,1,2,3,4,5};
    }

    public void testSwitch() throws Exception {
        tSwitch.Switch(temp);
    }

    public void testSwitch1() throws Exception {
        tSwitch.Switch1(temp);
    }
    public void testSwitch2() throws Exception {
        tSwitch.Switch2(temp);
    }
    public void testSwitch3()throws Exception{
        tSwitch.Switch3(array);
    }
}