package toOffer;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question29 {
    //数组中出现次数超过一半的数字
    public static<T> T solve(T [] array){
        assert (array!=null);
        int curCount=0; //当前的优势元素的数量
        T curData=null;    //当前的优势元素
        for(T temp:array){
            if(curCount==0 || temp.equals(curData)==true){
                curData=temp;
                curCount++;
            }else{
                --curCount;
            }
        }
        return curData;
    }
    public static<T extends Comparable<? super T>> T solve1(T [] array,int lower,int higher)
    {
        assert (array != null);
        return quickSorter(array,lower,higher);   //加强版的快速排序并查找
    }
    public static<T extends Comparable<? super T>> T quickSorter(
            T [] array,int lower, int higher){
        int i=lower;
        int j=higher;
        if(i==j){
            return array[i];
        }
        T tempData;
        while(i<j){
            tempData=array[i];
            for(;j>=lower;)
                if(array[j].compareTo(tempData)>0)
                    j--;
                else
                    break;
            for(;i<=higher;)
                if(array[i].compareTo(tempData)<=0)
                    i++;
                else
                    break;
            if(i>=j)
                break;
            T tempData1=array[j];
            array[j]=array[i];
            array[i]=tempData1;
        }
        T tempData1=array[j];
        array[j]=array[lower];
        array[lower]=tempData1;
        if(j==array.length/2)
            return array[j];
        else if(j>array.length/2)
            return quickSorter(array,lower,j-1);
        else
            return quickSorter(array,j+1,higher);
    }
}
