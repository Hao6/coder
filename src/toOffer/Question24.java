package toOffer;

/**
 * Created by hongji on 2017/4/1.
 */
//输入一个数组，数组中的内容是可能是一棵二叉搜素书的后续序列，如果是，则返回true，否则，返回false
public class Question24 {
    public static<T extends Comparable> boolean solve(T []array,int lower,int higher)
    {
        assert (array!=null && lower>=0 && higher>=0);
        return realSolutive(array,lower,higher);
    }
    public static <T extends Comparable> boolean realSolutive(T []array,int lower,int higher){
        if(higher<=lower)
            return true;
        T curData=array[higher];  //当前子树的最大节点
        int count=0;
        int dividingIndex=lower;
        for(int i=lower;i<higher;i++){
            if(array[i].compareTo(curData)>0){
                if(count==0){
                    dividingIndex=i; //找到疑似右子树的开始节点
                }
                ++count;
            }
        }
        if(count!=higher-dividingIndex && count!=0)  //只有右子树
            return false;
        return realSolutive(array,lower,dividingIndex-1)&&  //左子树
                realSolutive(array,dividingIndex,higher-1); //右子树
    }
}
