package Concurrent.ThinkingInJava.unit14;

import java.lang.reflect.Field;

/**
 * Created by hao on 17-5-11.
 */
class WithPrivateFinalFields{
    private int i=1;
    private final String s="I am totally safe";
    private String s2="Am I safe?";
    public String toString(){
        return "i= "+i+", "+s+", "+s2;
    }
}
public class ModifyingPrivateFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        WithPrivateFinalFields pf=new WithPrivateFinalFields();
        System.out.println(pf);

        Field f=pf.getClass().getDeclaredField("i");
        f.setAccessible(true);
        System.out.println("f.getInt(pf) "+f.getInt(pf));

        f.setInt(pf,49);

        f=pf.getClass().getDeclaredField("s");
        f.setAccessible(true);
        System.out.println("f.getInt(pf) "+f.get(pf));

        f.set(pf,"No, you are not safe");

        f=pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        System.out.println("f.getInt(pf) "+f.get(pf));

        f.set(pf,"No, you are not safe");

        System.out.println(pf);

    }
}
