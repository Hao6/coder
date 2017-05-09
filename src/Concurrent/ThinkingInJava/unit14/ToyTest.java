package Concurrent.ThinkingInJava.unit14;

/**
 * Created by hao on 17-5-9.
 */
interface HasBatteries {

}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    Toy() {

    }

    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name " + "[" + cc.getName() + "]" +
                "is a instance: " + "[" + cc.isInterface() + "]");
        System.out.println("Simple class name: " + cc.getSimpleName());
        System.out.println("Canonical class name: " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Concurrent.ThinkingInJava.unit14.FancyToy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        printInfo(c);

        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();   //需要一个默认构造器

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        printInfo(obj.getClass());
    }
}

