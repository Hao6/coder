package toOffer;

import cn.edu.redSkyline.LlinkedList;
import cn.edu.redSkyline.Piece;

import java.util.Iterator;

/**
 * Created by hongji on 2017/3/26.
 */
//两个单向链表的第一个公共节点
public class Question37 {
    public static Piece solve(LlinkedList link0,LlinkedList link1)
    {
        assert(link0!=null && link1!=null);
        Piece ret=null;
        int link0Len=link0.getSize();
        int link1Len=link1.getSize();
        int deltaLen=Math.abs(link0Len-link1Len);
        Iterator it0=link0.iterator();
        Iterator it1=link1.iterator();

        if(link0Len>link1Len){
            while(deltaLen>0){
                it0.next();
                deltaLen--;
            }
        }else if(link0Len<link1Len){
            while(deltaLen>0){
                it1.next();
                deltaLen--;
            }
        }else{
            return (Piece)(it0.next());
        }
        while(it0.hasNext() && it1.hasNext()){
            Piece temp0=(Piece)it0.next();
            Piece temp1=(Piece)it1.next();
            if(temp0.equals(temp1)){
                ret=temp0;
                break;
            }
        }
        return ret;
    }
}
