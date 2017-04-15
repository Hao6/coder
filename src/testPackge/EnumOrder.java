package testPackge;

/**
 * Created by hongji on 2017/3/12.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Denomination d:Denomination.values()){
            System.out.println(d+" "+d.ordinal());
        }
    }
}
