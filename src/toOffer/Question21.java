package toOffer;

import cn.edu.redSkyline.Sstack;

/**
 * Created by hongji on 2017/3/21.
 */
//包含min函数的栈，min()能够在O（1）的时间复杂度下返回当前栈中的最小元素
public class Question21<T extends Comparable<? super T>> {
    class minStack<T extends Comparable<? super T>>{  //设置为内部类，该类实现了min()函数
        Sstack mainStack;
        Sstack minStack;  //辅助函数栈，用来存放当前状态下的mainStack中的最小元素
        public minStack(Sstack mainStack,Sstack minStack){
            this.mainStack=mainStack;
            this.minStack=minStack;
        }
        public T pop(){
            minStack.pop();
            return (T)mainStack.pop();
        }
        public void push(T data){
            T curMinData=(T)minStack.peek();
            if(curMinData!=null  && data.compareTo(curMinData)>0){
                minStack.push(curMinData);
            }else{
                minStack.push(data);
            }
            mainStack.push(data);
        }
        public T min(){
            return (T)minStack.peek();
        }
    }
    public static<T> T getMin(Question21.minStack mStack){
        return (T)mStack.min();
    }
}
