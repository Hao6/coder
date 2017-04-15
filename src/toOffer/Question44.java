package toOffer;

import cn.edu.redSkyline.SortAndSearchUnit;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by hongji on 2017/3/19.
 */
public class Question44 {
    class Poker implements Comparable<Poker>{
        TypeOfPoker sign;  //花色
        int number;    //点数，大小王==0，J,Q,K分别记为11，12，13，A记为1
        public Poker(TypeOfPoker type,int index){
            sign=type;
            number=index;
        }
        public int compareTo(Poker anotherPoker){
            if(this.number>anotherPoker.number)
                return 1;
            else if(this.number<anotherPoker.number)
                return -1;
            else
                return 0;
        }
    }
    public static List<Poker> ipoker=new ArrayList<>();
    public void getApoker(){  //构造一副扑克牌
        ipoker.add(new Poker(TypeOfPoker.RED_JOKER,0)); //大王
        ipoker.add(new Poker(TypeOfPoker.BLACK_JOKER,0)); //小王
        for(int i=1;i<=13;i++){
            ipoker.add(new Poker(TypeOfPoker.HEART,i));
            ipoker.add(new Poker(TypeOfPoker.SPADE,i));
            ipoker.add(new Poker(TypeOfPoker.CLUB,i));
            ipoker.add(new Poker(TypeOfPoker.DIAMOND,i));
        }
    }
    public static boolean solve(Poker[] seriousPoker){

        //对抽取的5张牌进行快速排序
        SortAndSearchUnit.quickSort(seriousPoker,0,seriousPoker.length-1);
        int zeroOfCount=0;
        int distanceOfNonZero=0;
        for(int i=0;i<seriousPoker.length-1;i++){
            if(seriousPoker[i].number==0){
                ++zeroOfCount;
            }else{
                if(seriousPoker[i+1].number==seriousPoker[i].number)
                    return false;
                distanceOfNonZero+=seriousPoker[i+1].number-seriousPoker[i].number;
            }
            if(distanceOfNonZero>2)
                return false;
        }
        return (zeroOfCount>=distanceOfNonZero);
    }
}
