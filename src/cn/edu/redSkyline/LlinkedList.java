package cn.edu.redSkyline;

import java.util.Iterator;
/**
 * Created by hongji on 2017/3/22.
 */
public class LlinkedList<T extends Comparable>{
    private Piece<T> first;
    private Piece<T> end;
    private int size;  //链表长度

    public class LinkedIterator  implements Iterator{
        int curIndex;  //Iterator所指的当前下标
        Piece curPiece;  //当前所指向的块
        Piece preheadPiece;  //当前所指向的块的前一个块
        public LinkedIterator(){
            curIndex=0;
            curPiece=first;
            preheadPiece=null;
        }
        public Piece next(){
            preheadPiece=curPiece;
            Piece resPiece=curPiece.next;
            curPiece=resPiece; //块后移
            ++curIndex;
            return resPiece;
        }
        public boolean hasNext(){
            return curIndex<size;
        }
        public Piece iRemove(){
            //curPiece=curPiece.next;  //删除curPiece
            Piece newPiece=curPiece.next;
            curPiece.next=newPiece.next;
            newPiece.next=null;
            if(newPiece==end)
                end=curPiece;
            --size;
            return newPiece;
        }
        public void iAdd(Piece newPiece){
            newPiece.next=curPiece.next;
            curPiece.next=newPiece;
            ++size;
            if(curPiece==end)
                end=newPiece;
        }
    }

    public int getSize() {
        return size;
    }
    public Iterator iterator(){
        return new LinkedIterator();
    }
    public LlinkedList.LinkedIterator linkedIterator(){
        return new LinkedIterator();
    }
    public LlinkedList(){
        first=new Piece<T>();
        end=first;
    }
//    public LlinkedList(T firstData){
//        first=new Piece<T>(firstData);
//        end=first;
//    }
    public void add(T newData){
        Piece newEnd=new Piece(newData);
        end.next=newEnd;
        end=newEnd;
        ++size;
    }
    public void add(int index,T newData){ //添加到指定下标处
        if(index<0 || index>size)
            return;        //是否应该抛出异常?
        else{
            Piece tempFirst=first;
            int curIndex=0;
            while(tempFirst!=null){
                if(curIndex==index){
                    Piece newPiece=new Piece(newData);
                    newPiece.next=tempFirst.next;
                    tempFirst.next=newPiece;
                    if(index==size)
                        end=newPiece;
                    ++size;
                    break;
                }
                ++curIndex;
                tempFirst=tempFirst.next;
            }
        }
    }
    public void add(Piece newPiece){
        end.next=newPiece;
        end=newPiece;
        ++size;
    }
    public void remove(int index){ //删除指定下标处的Piece
        if(index<0 || index>=size)
            return;        //是否应该抛出异常?
        else{
            Piece tempFirst=first;
            int curIndex=0;
            while(tempFirst!=null){
                if(curIndex==index){
                    Piece removementPiece=tempFirst.next;
                    tempFirst.next=removementPiece.next;
                    removementPiece.next=null;
                    if(index+1==size)
                        end=tempFirst;
                    --size;
                    break;
                }
                ++curIndex;
                tempFirst=tempFirst.next;
            }
        }
    }
    public void remove(){  //默认从最后面开始删除
        if(first==end)  //空链表，无法删除,降低耦合性
            return;
        else{
            Piece tempFirst=first;
            while(tempFirst.next!=end){  //注意！=的用法，是否使用equals（）更好呢？
                tempFirst=tempFirst.next;
            }
            Piece removement=tempFirst.next;
            tempFirst.next=removement.next;
            removement.next=null;  //抛弃它
            end=tempFirst;
            --size;
        }
    }
    public Piece pop(){  //删除并返回第一个元素
        Piece retPiece=first.next;
        first.next=retPiece.next;
        retPiece.next=null;
        if(retPiece==end)
            end=first;
        --size;
        return retPiece;
    }
    public Piece getLast(){
        if(first==end)  //空链表，无法删除,降低耦合性
            return null;
        else{
            Piece tempFirst=first;
            while(tempFirst.next!=end){  //注意！=的用法，是否使用equals（）更好呢？
                tempFirst=tempFirst.next;
            }
            Piece removement=tempFirst.next;
            tempFirst.next=removement.next;
            removement.next=null;  //返回它
            end=tempFirst;
            --size;
            return removement;
        }
    }
    public boolean isEmpty(){ //判断是否非空
        return first==end;
    }
}
