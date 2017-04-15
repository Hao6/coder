package toOffer;

/**
 * Created by hongji on 2017/3/7.
 */
public class Positation {
    public int posiX;
    public int posiY;
    public int data;
    public Positation(int x,int y,int data){
        posiX=x;
        posiY=y;
        this.data=data;
    }

    @Override
    public String toString() {
        return posiX+" "+posiY+" ";
    }
}
