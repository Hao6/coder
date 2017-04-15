package cn.edu.redSkyline;

/**
 * Created by hongji on 2017/3/19.
 */
public class SortAndSearchUnit {
    public static <T extends Comparable<? super T>> void quickSort(T[] array,
                                                                   int lowerIndex, int highIndex)
    {
        assert (array!=null && lowerIndex>=0 && highIndex<array.length);
        if (highIndex <= lowerIndex)
            return;
        T tempData = array[lowerIndex];  //以首个数据作为参考，若是比其大，则放到数组后段，
        // 否则移到前段
        int i = lowerIndex;
        int j = highIndex;
        while (j > i) {
            for (; j >= lowerIndex; )
                if (array[j].compareTo(tempData) > 0)
                    j--;
                else
                    break;
            for (; i <= highIndex; )
                if (array[i].compareTo(tempData) <= 0)
                    i++;
                else
                    break;
            if (i >= j)
                break;
            T tempData1 = array[j];
            array[j] = array[i];
            array[i] = tempData1;
        }
        T tempData1 = array[j];
        array[j] = array[lowerIndex];
        array[lowerIndex] = tempData1;
        quickSort(array, lowerIndex, j - 1);
        quickSort(array, j + 1, highIndex);
    }

    //原始归并排序（无任何优化操作，直接在原数组上进行划分，在辅助数组上归并，并将归并后的数组区间复制
    // 到原数组上的相同区间）
    public static int count=0;  //T 数组中逆序对个数
    public static <T extends Comparable<? super T>> void mergeSort(T[] array,
                                                                   int lowerIndex, int highIndex)
    {
        assert (array!=null && lowerIndex>=0 && highIndex<array.length);
        if (lowerIndex == highIndex)
            return;
        else {
            int middle = lowerIndex + (highIndex - lowerIndex) / 2;
            mergeSort(array, lowerIndex, middle);
            mergeSort(array, middle + 1, highIndex);
            merge(array, lowerIndex, middle, highIndex);   //归并操作
        }

    }

    public static <T extends Comparable<? super T>> void merge(T[] array, int lowerIndex,
                                                               int middle, int highIndex) {
        int lowerIndex1 = middle + 1; //第二段数组的起始下标
        T[] tempArray = (T[]) new Comparable[highIndex - lowerIndex + 1];
        int z = 0;
        int i, j;
        for (i = lowerIndex, j = lowerIndex1; i <= middle && j <= highIndex; ) {
            if (array[i].compareTo(array[j]) > 0) {
                tempArray[z++] = array[j++];
                count+=(middle-i+1);
            } else {
                tempArray[z++] = array[i++];
            }
        }
        if(i<=middle) {          //前半段有剩余
            for (; i <= middle; ) {
                tempArray[z++] = array[i++];
            }
        }
        else if(j<=highIndex) { //后半段有剩余
            for (; j <= highIndex; ) {
                tempArray[z++] = array[j++];
            }
        }
        System.arraycopy(tempArray,0,array,lowerIndex,highIndex-lowerIndex+1);
    }
    //冒泡排序
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array,
                                                                   int lowerIndex, int highIndex){
        assert (array!=null && lowerIndex>=0 && highIndex<array.length);
        int i=lowerIndex;
        int j=highIndex;
        T temp;
        if(i>=j)
            return;
        for(;j>i;) {
            int z;
            for (z=j; z > i; z--) {
                if (array[z].compareTo(array[z - 1]) < 0) {
                    temp = array[z];
                    array[z] = array[z - 1];
                    array[z - 1] = temp;
                }
            }
            ++i;
        }
    }
    //选择排序
    public static <T extends Comparable<? super T>> void selectSort(T[] array,
                                                                    int lowerIndex, int highIndex) {
        assert (array != null && lowerIndex >= 0 && highIndex < array.length);
        int temp;
        T tempData;
        for(int i = lowerIndex;i<highIndex;i++){
            temp=i;
            for(int j=i;j<=highIndex;j++){
                if(array[temp].compareTo(array[j])>0){
                    temp=j;
                }
            }
            tempData=array[temp];
            array[temp]=array[i];
            array[i]=tempData;
        }
    }
    //插入排序
    public static <T extends Comparable<? super T>> void insertSort(T[] array,
                                                                    int lowerIndex, int highIndex) {
        assert (array != null && lowerIndex >= 0 && highIndex < array.length);
        T temp;
        for(int i = lowerIndex+1;i<=highIndex;i++){
            for(int j=i;j>lowerIndex;j--){
                if(array[j].compareTo(array[j-1])<0){
                    temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
                else
                    break;
            }
        }
    }
}
