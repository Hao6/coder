package cn.edu.redSkyline;

/**
 * Created by hongji on 2017/3/22.
 */
public class Piece<T extends Comparable> implements Comparable<Piece> {
    public T data;  //数值域
    public Piece next;  //指针域
    public Piece(){
        this.data=null;
        this.next=null;
    }
    public Piece(T data){  //两个构造函数
        this.data=data;
        this.next=null;
    }
    public Piece(T data,Piece nextPiece){  //两个构造函数
        this.data=data;
        this.next=nextPiece;
    }
    public int compareTo(Piece anotherPiece){
        return this.data.compareTo(anotherPiece.data);
    }

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                '}';
    }
}
