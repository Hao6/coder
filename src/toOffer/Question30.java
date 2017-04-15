package toOffer;

import java.util.TreeMap;

/**
 * Created by hongji on 2017/3/20.
 */
public class Question30 {
    //数组中最小的K个数
    //方法1，利用快速排序，迅速找到K-1这个位置
    public static<T extends  Comparable<? super T>> void solve(T []array,int k){
        int lower=0;
        int higher=array.length-1;
        if(k>=higher+1 || k<=0)  //k不小于数组长度，则默认返回全数组
            return;
        quickSearcher(array,k,lower,higher);
    }
    public static<T extends  Comparable<? super T>> void quickSearcher(
            T []array,int k,int lower,int higher){
        int i=lower;
        int j=higher;
        T tempData;
        if(i>=j)
            return;
        while(i<j){
            tempData=array[lower];
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
        if(j==k)
            return;
        else if(j>k)
            quickSearcher(array,k,lower,j-1);
        else
            quickSearcher(array,k,j+1,higher);
    }
    //使用一定容量的TreeMap作为存储集合，键值为数组元素，value为出现次数，依次遍历数组
    public static<T extends  Comparable<? super T>> TreeMap<T,Integer> solve1(
            T []array, int k){
        int countOfRepeat=0;  //元素重复次数，因为TreeMap不允许键值重复
        TreeMap<T,Integer> kMap=new TreeMap<T, Integer>();
        for(T temp:array){
            if(kMap.size()+countOfRepeat<k){  //没有超过k个容量
                if(kMap.containsKey(temp))
                {
                    ++countOfRepeat;   //重复次数增加一次
                    int curTime=kMap.get(temp);
                    kMap.put(temp,curTime+1);  //更新数据
                }else{
                    kMap.put(temp,1);
                }
            }
            else //超过k个容量，需要用当前的temp与kMap的最小key相比较
            {
                T maxKey=kMap.lastKey();
                if(maxKey.compareTo(temp)>0) //需要替换
                {
                    int valueOfMaxKey=kMap.get(maxKey);
                    if(valueOfMaxKey>1){
                        kMap.put(maxKey,valueOfMaxKey-1);  //出现次数减一
                        --countOfRepeat;   //重复次数减少一次
                        kMap.put(temp,1);
                    }
                    else
                    {
                        kMap.remove(maxKey);   //没有重复，所以直接删去
                        //需要考虑到temp早已存在
                        if(kMap.containsKey(temp))
                        {
                            ++countOfRepeat;   //重复次数增加一次
                            int curTime=kMap.get(temp);
                            kMap.put(temp,curTime+1);  //更新数据
                        }else{
                            kMap.put(temp,1);
                        }
                    }
                }
            }
        }
        return kMap;
    }

}
