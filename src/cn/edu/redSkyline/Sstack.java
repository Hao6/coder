package cn.edu.redSkyline;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by hongji on 2017/3/21.
 */
//模仿栈的操作
public class Sstack<T> {
    private LinkedList<T> stackList;  //用来存放数据,封装了LinkedList
    public Sstack(){
        stackList=new LinkedList<T>();
    }
    public T pop(){     //出栈
        return stackList.pop();
    }
    public void push(T data){   //入栈
        stackList.push(data);
    }
    public T peek(){ //返回栈顶元素的引用
        return stackList.peek();
    }
    public Iterator iterator(){  //返回迭代器
        return stackList.iterator();
    }
    public ListIterator listIterator(){ //返回双向迭代器
        return stackList.listIterator();
    }
    public int size(){
        return stackList.size();
    }
}
