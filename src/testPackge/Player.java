package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public interface Player {
    default void doEverything(){
        System.out.println("Player");
    }
}
