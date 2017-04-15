package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public interface SonOfPlayer extends CanFight,CanSwim {
    default void doSomething() {
        System.out.println("doSomething of"+SonOfPlayer.class.toString());
    }

    default void swim(){
        System.out.println("SonOfPlayer-swim");
    }
}
