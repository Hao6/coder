package toOffer;

/**
 * Created by hao on 17-5-21.
 */
public class HashCoder {
    int i;
    String str;
    boolean sign;

    public HashCoder() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HashCoder hashCoder = (HashCoder) o;

        if (i != hashCoder.i) return false;
        if (sign != hashCoder.sign) return false;
        return str.equals(hashCoder.str);
    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + str.hashCode();
        result = 31 * result + (sign ? 1 : 0);
        return result;
    }
}
