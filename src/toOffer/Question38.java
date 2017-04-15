package toOffer;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question38 {
    //某一数字在排序数组中出现的次数，即某些数字出现的次数可能多于一次或者0次
    public static<T extends Comparable<? super T>> int solve(T [] array,T answer){
        int lowerPosi=binarySearcher0(array,0,array.length-1,answer);
        if(lowerPosi!=-1){
            int higherPosi=binarySearcher1(array,lowerPosi,array.length-1,answer);
            return higherPosi-lowerPosi+1;
        }else
            return 0;
    }
    public static<T extends Comparable<? super T>> int
                binarySearcher0(T []array,int lower,int higher, T answer){ //加强版的二分查找
        int i=lower;
        int j=higher;
        int middle;
        while(i<=j){
            middle=i+(j-i)/2;
            if(array[middle].compareTo(answer)>0){
                j=middle-1;
            }else if(array[middle].compareTo(answer)<0){
                i=middle+1;
            }else{        //array[middle].compareTo(answer)==0
                if(middle-1>=lower && array[middle-1]!=answer ||middle==lower) {
                    return middle;
                }
                else {
                    j = middle - 1;
                }
            }
        }
        return -1;
    }
    public static<T extends Comparable<? super T>> int
    binarySearcher1(T []array,int lower,int higher, T answer){ //加强版的二分查找
        int i=lower;
        int j=higher;
        int middle;
        while(i<=j){
            middle=i+(j-i)/2;
            if(array[middle].compareTo(answer)>0){
                j=middle-1;
            }else if(array[middle].compareTo(answer)<0){
                i=middle+1;
            }else{        //array[middle].compareTo(answer)==0
                if(middle+1<=higher && array[middle+1]!=answer || middle==higher)
                {
                    return middle;
                }
                else
                    i=middle+1;
            }
        }
        return -1;
    }
}
