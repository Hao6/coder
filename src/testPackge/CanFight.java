package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public interface CanFight extends Player{
    default void fight()    //默认访问限制符是public
    {
        System.out.println("fight of CanFight");
    }
}
