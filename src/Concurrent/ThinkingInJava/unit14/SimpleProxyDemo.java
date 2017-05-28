package Concurrent.ThinkingInJava.unit14;

/**
 * Created by hao on 17-5-11.
 */
interface Interface{
    void doSomething();
    void somethingElse(String arg);
}

class RealObject implements Interface{
    public void doSomething(){
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("somethingElse "+arg);
    }
}
class simpleProxy implements Interface{
    private Interface proxied;
    public simpleProxy(Interface proxied){
        this.proxied=proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse "+arg);
        proxied.somethingElse(arg);
    }
}
public class SimpleProxyDemo {
    public static void consumer(Interface iface){
        iface.doSomething();
        iface.somethingElse("bonono");
    }
    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new simpleProxy(new RealObject()));
    }
}
