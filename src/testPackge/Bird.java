package testPackge;

/**
 * Created by hongji on 2017/3/9.
 */
public class Bird extends AbstractBird {
    //Bird bird;
    String a="123";
    String b;
    String sea="456";
    static String c="ccc";
    static void abs2Nabs(AbstractBird ab){
        Bird bird=(Bird) ab;
    }
    public Bird(String b,int c){
        this.b=b;
    }
    /*参数列表的顺序可以实现函数重载*/
    public Bird(int c,String b){
        this.b=b;
    }
    protected void finalize(){   //暂时没有调用
        if(c=="ccc")
            System.out.println("I am a finalize");
    }

    public static void main(String[] args) {
        Bird bird=new Bird("bbb",1);

        Bird bird1=new Bird(2,"78"); //一定程度上降低了程序可读性
        bird.a="675";
        bird.b="567";
        System.gc();

    }
}
