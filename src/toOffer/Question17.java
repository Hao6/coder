package toOffer;

import cn.edu.redSkyline.LlinkedList;
import cn.edu.redSkyline.Piece;

import java.util.Iterator;

/**
 * Created by hongji on 2017/3/23.
 */
//合并两个已经排序的链表
public class Question17 {
    //无返回值，直接将合并后的结果存放在link0中,link1同时被拆光（size==0）
    public static void solve(LlinkedList link0,LlinkedList link1){ //有问题，需要治疗，暂时放弃
        assert(link0!=null && link1!=null);
        LlinkedList.LinkedIterator it0=link0.linkedIterator();
        LlinkedList.LinkedIterator it1=link1.linkedIterator();
        Piece tempPiece;
        Piece tempPiece1;
        for(;it0.hasNext()==true;it0.next()){
            for(;it1.hasNext()==true;it1.next()){
                tempPiece=(Piece) it0.next();
                tempPiece1=(Piece) it1.next();
                if(tempPiece1.compareTo(tempPiece)<0){
                    tempPiece=it1.iRemove();
                    it0.iAdd(tempPiece);
                }else
                    break;
            }
        }
        if(it1.hasNext()){
            Piece newPiece;
            while(it1.hasNext()){
                newPiece=it1.iRemove();  //删除一个
                link0.add(newPiece);  //添加到尾部
            }
        }
    }
    //将结果保存到第三个链表中
    public static LlinkedList solve1(LlinkedList link0,LlinkedList link1){
        LlinkedList ret=new LlinkedList();
        LlinkedList.LinkedIterator it0=link0.linkedIterator();
        LlinkedList.LinkedIterator it1=link1.linkedIterator();
        Piece tempPiece=(Piece) it0.next();
        Piece tempPiece1=(Piece) it1.next();
        while(true){
            if(tempPiece.compareTo(tempPiece1)<0) {
                ret.add(tempPiece.data);
                if(it0.hasNext())
                    tempPiece=(Piece) it0.next();
                else
                    break;
            }
            else {
                ret.add(tempPiece1.data);
                if(it1.hasNext())
                    tempPiece1=(Piece) it1.next();
                else
                    break;
            }
        }
        if(it0.hasNext()){
            Piece newPiece;
            ret.add(tempPiece);
            while(it0.hasNext()){
                newPiece=it0.next();
                ret.add(newPiece.data);  //添加到尾部
            }
        }else if(it1.hasNext()){
            Piece newPiece;
            ret.add(tempPiece1);
            while(it1.hasNext()){
                newPiece=it1.next();  //删除一个
                ret.add(newPiece.data);  //添加到尾部
            }
        }
        return ret;
    }
}
