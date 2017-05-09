package Concurrent.ThinkingInJava.unit14;

/**
 * Created by hao on 17-5-9.
 */
class Candy{
    static{
        System.out.println("Loading candy");
    }
}
class Gum{
    static{
        System.out.println("Loading gum");
    }
}
class Cookie{
    static{
        System.out.println("Loading cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("inside main");
        new Candy();
        System.out.println("After create candy");
        try {
            Class.forName("Concurrent.ThinkingInJava.unit14.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After create gum");
        new Cookie();
        System.out.println("After create cookie");
    }
}
