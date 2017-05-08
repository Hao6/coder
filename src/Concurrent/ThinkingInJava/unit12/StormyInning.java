package Concurrent.ThinkingInJava.unit12;

/**
 * Created by hao on 17-5-8.
 */

class BaseballException extends Exception{}
class Foul extends BaseballException{}
class Strike extends BaseballException{}

abstract class Inning{
    public Inning()throws BaseballException{}
    public void event()throws BaseballException{

    }
    public abstract void atBat()throws Foul,Strike;
    public void walk(){}
}

class StormException extends Exception{}
class  RainedOut extends StormException{}
class  PopFoul extends Foul{}

interface Storm{
    public abstract  void event()throws RainedOut;
    public abstract void rainHard()throws RainedOut;
    final static int a=5;
}


public class StormyInning extends Inning implements Storm {
    public void atBat()throws PopFoul{  //对于抽象方法的重写，抛出的异常种类必须与父类同名方法一致，
        // 不多于父类抛出的异常种类

    }
    public void event(){

    }
    public void rainHard(){  //实现的接口方法可以抛出任意类型的异常

    }
//    public void event()throws Foul{}
    public StormyInning()throws BaseballException,Foul,PopFoul{

    }
    public StormyInning(String s)throws BaseballException,Strike{

    }
//    void walk(){  //Compile error
//
//    }
    //interface CANNOT add exceptions to existing methods from the base class
    // ,继承的父类与实现的借口具有相同的签名，以父类的函数抛出异常情况为准
//    public void event()throws RainedOut{
//
//    }

}
