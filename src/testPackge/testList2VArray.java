package testPackge;

/**
 * Created by hongji on 2017/3/26.
 */
public class testList2VArray {
    public static void test(int[][] array){
        int xLen=array.length;
        int yLen=array[0].length;
        int a=0;
        for(int i=0;i<xLen;i++){
            for(int j=0;j<yLen;j++){
                a=array[i][j];
            }
        }
    }
    public static void test1(int[][] array){
        int xLen=array.length;
        int yLen=array[0].length;
        int a=0;
        for(int i=0;i<yLen;i++){
            for(int j=0;j<xLen;j++){
                a=array[j][i];
            }
        }
    }
}
