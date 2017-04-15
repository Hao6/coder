package toOffer;

import cn.edu.redSkyline.LlinkedList;
import cn.edu.redSkyline.Piece;
import cn.edu.redSkyline.Sstack;

/**
 * Created by hongji on 2017/3/22.
 */
//反转链表
public class Question16 {
    //给你一个自造的单向链表，你将他原地反转
    public static void solve(LlinkedList link0){
        assert (link0!=null);
        Sstack<Piece> helpStack=new Sstack<>(); //借助栈实现
        while(link0.getSize()>0){
            Piece newPiece=link0.pop();
            helpStack.push(newPiece);
        }
        while(helpStack.size()>0){
            Piece newPiece=helpStack.pop();
            link0.add(newPiece.data);
        }
    }
    public static void solve1(LlinkedList link0){
        assert (link0!=null);
        int n=link0.getSize()-1;
        for(int i=0;i<n;i++){  //大循环算法，从队尾拆下来，接在对头，栈的痕迹
            Piece newPiece=link0.getLast();
            link0.add(i,newPiece.data);
        }

    }
}
