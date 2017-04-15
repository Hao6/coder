package toOffer;

import cn.edu.redSkyline.Qqueue;
import cn.edu.redSkyline.Sstack;

/**
 * Created by hongji on 2017/3/21.
 */
public class Question7 {
    //使用两个栈实现队列
     class twoStacks2Queue<T>{  //两个栈实现一个队列，主要是模仿出队入队操作
        private Sstack stack0;  //1号栈
        private Sstack stack1;  //2号栈
        public twoStacks2Queue(Sstack stack0,Sstack stack1){ //构造函数
            this.stack0=stack0;
            this.stack1=stack1;
        }
        public T pop(){
            if(stack1.size()==0) {
                while (stack0.size() > 0) {
                    T data = (T) stack0.pop();
                    stack1.push(data);
                }
            }
            return (T)stack1.pop();
        }
        public void push(T data){
            stack0.push(data);
        }
        public int size(){
            return stack0.size()+stack1.size();
        }
    }
     class twoQueues2Stack<T>{  //两个队列实现一个栈，主要是模仿压栈出栈操作
        private Qqueue queue0;  //1号栈
        private Qqueue queue1;  //2号栈
        int sign; //标识需要入队的队列
        public twoQueues2Stack(Qqueue queue0,Qqueue queue1){ //构造函数
            this.queue0=queue0;
            this.queue1=queue1;
            sign=0;  //默认初始化由0号队列接受入队元素
        }
        public T pop(){
            T data;
            if(sign==0){
                while(queue0.size()>1){
                    data=(T)queue0.pop();
                    queue1.push(data);
                }
                data=(T)queue0.pop();  //queue0中队尾元素
                sign=1;
                return data;
            }else{
                while(queue1.size()>1){
                    data=(T)queue1.pop();
                    queue0.push(data);
                }
                data=(T)queue1.pop(); //queue1中队尾元素
                sign=0;
                return data;
            }
        }
        public void push(T data){
            if(sign==0)
                queue0.push(data);
            else
                queue1.push(data);
        }
        public int size(){
            if(sign==0)
                return queue0.size();
            else
                return queue1.size();
        }
    }
    public static twoStacks2Queue getATwoStacks2Queue(Sstack stack0,Sstack stack1){
        Question7 q7=new Question7();
        Question7.twoStacks2Queue sq=q7.new twoStacks2Queue(stack0,stack1);
        return sq;
    }
    public static twoQueues2Stack getATwoQueues2Stack(Qqueue queue0,Qqueue queue1){
        Question7 q7=new Question7();
        Question7.twoQueues2Stack qs=q7.new twoQueues2Stack(queue0,queue1);
        return qs;
    }
}
