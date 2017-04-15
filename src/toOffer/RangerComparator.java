package toOffer;

import java.util.Comparator;

/**
 * Created by hongji on 2017/3/16.
 */
public class RangerComparator implements Comparator<Ranger> {
    public int compare(Ranger r0,Ranger r1){
        return r0.compareTo(r1);
    }
}
