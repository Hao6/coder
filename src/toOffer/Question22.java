package toOffer;

import cn.edu.redSkyline.Sstack;

/**
 * Created by hongji on 2017/3/21.
 */
//输入两个相同类型的序列，第一个序列是栈的压入序列，判断第二个序列是否可能是栈的弹出序列，
// 假设压入序列中所有元素均不相同
public class Question22 {
    public static<T> boolean solve(T pushArr[],T popArr[]){
        assert (pushArr!=null && popArr!=null);
        int pushArrLen=pushArr.length;
        Sstack<T> testStack=new Sstack<T>();
        int i=0;
        for(T temp:popArr){
            while(testStack.peek()!=temp){
                if(i>=pushArrLen)
                    return false;
                testStack.push(pushArr[i++]);
            }
            testStack.pop();
        }
        return true;
    }
}
