package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public class Outer {
    private String label;
    public Outer(String label){
        this.label=label;
    }

    private class Inner{
        public Inner(){
            System.out.println("I am a Inner");
        }
        public void showLabel(){
            System.out.println(label.toString());
        }
    }

    public Inner getAInner(){
        return new Inner();
    }
    //Inner a=new Inner();
    public static void main(String[] args) {
        Outer outer=new Outer("ert");
        Outer.Inner oi=outer.getAInner();
        oi.showLabel();
    }
}
