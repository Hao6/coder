package toOffer;

import java.util.Comparator;

/**
 * Created by hongji on 2017/3/15.
 */
public class Ranger<T> implements Comparable<Ranger>{
    T data;
    int range;
    public Ranger(T data,int range){
        this.data=data;
        this.range=range;
    }
    public int compareTo(Ranger ranger){
        assert(ranger!=null);
        if(this.equals(ranger)==false) {
            if (this.range > ranger.range) {
                return 1;
            } else
                return -1;
        }
        else
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ranger ranger = (Ranger) o;
        return data.equals(ranger.data);
    }

    @Override
    public int hashCode() {
        return data.hashCode();
    }
}
