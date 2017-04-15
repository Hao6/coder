package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public interface CanSwim extends Player{
    default void swim() {
        System.out.println("swim"+ CanSwim.class.toString());
    }
}
