package testPackge;

/**
 * Created by hongji on 2017/3/13.
 */
public class Amphibian {
    private int i;
    final A a;   //必须确保在每个构造器内部初始化final值，引用，或者直接在原地初始化
    public Amphibian(){
        this.a = new A();
    }
    public Amphibian(int i) {
        this.i = i;
        this.a = new A();
    }

    public void print(){
        System.out.println("I am a Amphibian");
    }
    private void printHello(){
        System.out.println("Hello");
    }
    void printHi(){
        System.out.println("Hi");
    }
    final protected void printData(){
        System.out.println("data");
    }
}
