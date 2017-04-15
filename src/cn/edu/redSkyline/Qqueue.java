package cn.edu.redSkyline;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by hongji on 2017/3/21.
 */
//模仿队列的操作
public class Qqueue<T> {
    private LinkedList<T> queueList;  //用来存放数据,封装了LinkedList
    public Qqueue(){
        queueList=new LinkedList<T>();
    }
    public T pop(){  //入队
        return queueList.pop();
    }
    public void push(T data){  //出队
        queueList.add(data);
    }
    public T peek(){  //返回队头元素的引用
        return queueList.peek();
    }
    public Iterator iterator(){
        return queueList.iterator();
    }
    public ListIterator listIterator(){
        return queueList.listIterator();
    }
    public int size(){
        return queueList.size();
    }
}
