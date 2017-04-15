package testPackge;

/**
 * Created by hongji on 2017/3/16.
 */
public class Hero extends ActionCharacter //相当于ActionCharacter的fight()方法实
// 现了CanFight中的fight()
implements CanFight,CanSwim{
    public void swim(){};
}
