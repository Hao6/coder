package toOffer;

/**
 * Created by hongji on 2017/3/20.
 */
public class ZeroOrNozero implements IsOneOfAKind {
    int data;
    public ZeroOrNozero(int data){
        this.data=data;
    }
    public boolean isTheKind(){
        return data!=0;
    }
}
