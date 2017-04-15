package cn.edu.redSkyline;

/**
 * Created by hongji on 2017/3/26.
 */
//拥有两个指针域的节点
public class DoublePiece<T extends Comparable> implements Comparable<DoublePiece>{
    public T data;  //数值域
    public DoublePiece next;  //指针域
    public DoublePiece second; //另一个指针域
    public DoublePiece(){
        this.data=null;
        this.next=null;
        this.second=null;
    }
    public DoublePiece(T data){  //两个构造函数
        this.data=data;
        this.next=null;
        this.second=null;

    }
    public DoublePiece(T data,DoublePiece nextPiece,DoublePiece secondPiece){  //两个构造函数
        this.data=data;
        this.next=nextPiece;
        this.second=secondPiece;
    }
    public int compareTo(DoublePiece anotherPiece){
        return this.data.compareTo(anotherPiece.data);
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
    public boolean isLeaf(){
        return this.next==null && this.second==null;
    }
}
