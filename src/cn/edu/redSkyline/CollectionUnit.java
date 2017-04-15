package cn.edu.redSkyline;

import java.util.*;

/**
 * Created by hongji on 2017/3/15.
 */
public class CollectionUnit {
    private final static int NUMBER_EACH_LINES=20;    //每行打印的数据个数
    public static<T> void printCollection(Collection<T> collection){
        Iterator<T> iterator=collection.iterator();
        int count=1;
        System.out.print("{");
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            if(count++%NUMBER_EACH_LINES==0){
                System.out.println();
            }
        }
        System.out.println("}");
    }
    public static<T> void printReverseList(List<T> list,Iterator it){  //逆序打印线性序列
        if(it.hasNext()){
            //it下移,it是不可逆转的
            T temp=(T)it.next();
            printReverseList(list,it);
            System.out.println(temp);
        }else{
            return;
        }

    }
    public static<T> T getReverseKth(List<T> list,int k){
        //线性序列的倒数第K个元素,最后一个元素是倒数第1个
        assert(list!=null);
        T ret=null;
        if(list.size()<k || k<0){
            throw new IndexOutOfBoundsException("序列中没有K个元素");
            //return ret;    无法抵达这一步
        }
        ListIterator firstIt=list.listIterator(k-1);   //从下标K处开始遍历
        Iterator secondIt=list.iterator();           //从下标0处开始遍历
        while(firstIt.hasNext()){
            firstIt.next();
            ret=(T)secondIt.next();
        }
        return ret;
    }
    public static<T> T recycleList(List<T> list,int stepLength){ //使线性序列达到循环序列的
        // 效果，即伪装成循环序列，求解序列中最后剩下的元素
        assert(list!=null && stepLength>0);
        Iterator it=list.iterator();
        int count=0;
        while(list.size()>1){  //只剩一个
            if(it.hasNext()==false){
                it=list.iterator();
            }
            it.next();
            count++;
            if(count==stepLength){
                it.remove();
                count=0;
            }
        }
        return list.get(0); //返回最后剩余的元素
    }
    public static<T> T recycleList1(List<T> list,int stepLength){
        assert(list!=null && stepLength>0);
        int n=list.size();
        int finalIndex=0;   //最终剩下的元素最终下标
        int initIndex=0;    //最终剩下的元素初始下标
        for(int i=0;i<n;i++){
            initIndex=(finalIndex+stepLength)%n;
            finalIndex=initIndex;
        }
        return list.get(initIndex);
    }

    public static void main(String[] args) {
        List<Character> list=new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('b');
        Iterator it=list.iterator();
        CollectionUnit.printReverseList(list,it);
    }
}
