package toOffer;

import cn.edu.redSkyline.SortAndSearchUnit;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question33 {
    //把数组排成最小的数，输入一个整型数组
    public static String solve(int[] intArray) {
        assert (intArray != null);
        Data[] data = new Data[intArray.length];
        String res = new String();
        int i = 0;
        for (int temp : intArray) {
            data[i++] = new Data(String.valueOf(temp));
        }
        SortAndSearchUnit.quickSort(data, 0, data.length - 1);
        for (Data datas : data) {
            res += datas.data;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] intArr = {3, 32, 321, 2};
        String res = Question33.solve(intArr);
        System.out.println(res);
    }
}
