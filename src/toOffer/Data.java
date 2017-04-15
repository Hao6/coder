package toOffer;

/**
 * Created by hongji on 2017/3/20.
 */
public class Data implements Comparable<Data> {
    String data;
    public Data(String data){
        this.data=data;
    }
    public int compareTo(Data anotherData){
        String str0=this.data.concat(anotherData.data);
        String str1=anotherData.data.concat(this.data);
        return str0.compareTo(str1);
    }
}
