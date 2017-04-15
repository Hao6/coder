package testPackge;

/**
 * Created by hongji on 2017/3/21.
 */
public class TestPow {
    public static void main(String[] args) {
        double []base={-3,-2,-1,0,1,2,3};
        int []exponend={-3,-2,-1,0,1,2,3};
        for(int i=0;i<base.length;i++){
            for(int j=0;j<exponend.length;j++){
                System.out.println(base[i]+"^"+exponend[j]+"="+Math.pow(base[i],exponend[j]));
            }
        }
    }
}
