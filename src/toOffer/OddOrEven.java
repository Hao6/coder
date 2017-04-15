package toOffer;

/**
 * Created by hongji on 2017/3/20.
 */
public class OddOrEven implements IsOneOfAKind {
    int data;
    public OddOrEven(int data){
        this.data=data;
    }
    public boolean isTheKind(){  //奇数返回false,偶数返回true
        return data%2==0;
    }
}
